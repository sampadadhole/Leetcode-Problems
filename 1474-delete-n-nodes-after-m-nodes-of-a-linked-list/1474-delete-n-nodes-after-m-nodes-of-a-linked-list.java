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
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode curr = head;
        ListNode prev = head;
        while(curr!=null){
            int mc = m;
            int nc = n;
            while(curr!=null && mc!=0){
                 prev = curr;
                curr = curr.next;
                mc--;
            }
            while(curr!=null && nc!=0){
                curr = curr.next;
                nc--;
            }
            prev.next= curr;
           
        }
        return head;
    }
}