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
    public ListNode swapPairs(ListNode head) {
        
        ListNode curr = head;
        ListNode firstNode = curr;
        ListNode temp = new ListNode(0);
        while(curr!=null && curr.next!=null){
            temp.val = curr.next.val;
            curr.next.val = curr.val;
            curr.val = temp.val;
            
            
            curr = curr.next.next;
        }
        return head;
    }
}