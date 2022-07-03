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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size =0;
        ListNode vale = new ListNode(0);
        vale.next = head;
        ListNode curr = head;
        while(curr!=null){
            size++;
            curr = curr.next;
            
        }
        size = size-n;
         curr = vale;
        while(size>0){
            size--;
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return vale.next;
    }
}