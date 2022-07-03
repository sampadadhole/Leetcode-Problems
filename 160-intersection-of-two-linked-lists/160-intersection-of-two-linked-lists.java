/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        Set<ListNode> map = new HashSet<ListNode>();
        ListNode curr = headB;
        while(curr!=null){
            map.add(curr);
            curr = curr.next;
        }
        
        while(headA!=null){
            if(map.contains(headA)){
                return headA;
            }
            headA = headA.next;
        }
        return null;
    }
}