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
       if(headA==null ||headB==null)return null;
        ListNode cA=headA;
        ListNode cB=headB;
        while(cA!=cB){
            cA=cA==null?headB:cA.next;
            cB=cB==null?headA:cB.next;
        }
        return cA;
    }
}