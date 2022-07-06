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
    public ListNode middleNode(ListNode head) {
        
        int size =0;
        ListNode[] arr = new ListNode[100];
        ListNode curr = head;
        while(curr!=null){
            // size++;
            arr[size++] = curr;
            curr = curr.next;
        }
        // System.out.print(arr[size/2]);
           return arr[size/2];
        
    }
 
}