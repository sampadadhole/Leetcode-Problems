/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, ListNode> map = new HashMap<>();
        ListNode value = new ListNode();
        while(head!=null){
            if(map.containsKey(head)){
                 value = head;
                return value;
            }
            else{
                map.put(head, head.next);
                head = head.next;
            }
        }
        return null;
       // int count =0;
       //  ListNode curr = head;
       //  while(value.val!=curr.val){
       //      curr = curr.next;
       //      count++;
       //  }
       //  return count;
        
    }
}