/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
     ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> reversed = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null){
            arr.add(curr.val);
            curr = curr.next;
        }
        for(int i=arr.size()-1;i>=0;i--){
            reversed.add(arr.get(i));
        }
        return arr.equals(reversed);
    }
}