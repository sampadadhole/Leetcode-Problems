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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr = head;
        ListNode temp1 = new ListNode(0);
        ListNode temp2 = new ListNode(0);
        int size =0;
        while(curr!=null){
            size++;
            curr = curr.next;
        }
        int count =0;
        curr = head;
        while(curr!=null){
            count++;
            // 
            if(count==k){
                temp1.val = curr.val;
               System.out.println(temp1.val);
            }
            if(count == size-k+1){
                temp2.val = curr.val;
                System.out.println(temp2.val);
            }
           
            curr = curr.next;
            
        }
        curr = head;
        int c =0;
        while(curr!=null){
            c++;
              if(c==k){
                curr.val = temp2.val;
            }
            if(c == size-k+1){
                curr.val = temp1.val;
            }
            curr = curr.next;
        }
        return head;
        
    }
}