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
        if(head==null||head.next==null)return true;
        ListNode slow=head,fast=head;
        Stack<ListNode> st=new Stack<>();
        while(fast!=null && fast.next!=null){
            st.push(slow);
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null)slow=slow.next;
        
        while(slow!=null){
            if(slow.val!=st.peek().val)return false;
            else st.pop();
            slow=slow.next;
        }
        return true;
    }
   
}