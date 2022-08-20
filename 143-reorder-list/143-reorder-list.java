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
    public void reorderList(ListNode head) {
        ListNode temp=head,slow=head,fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Stack<Integer> st=new Stack<>();
        while(slow.next!=null){
            st.push(slow.next.val);
            slow.next=slow.next.next;    
        }
        while(!st.isEmpty()){
            ListNode var=temp.next;
            ListNode temp2=new ListNode(st.pop());
            temp.next=temp2;
            temp2.next=var;
            temp=var;
        }
    }
}