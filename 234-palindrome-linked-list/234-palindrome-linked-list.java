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
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null)slow=slow.next;
        slow=reverse(slow);
        fast=head;
        while(slow!=null){
            if(slow.val!=fast.val)return false;
            slow=slow.next;
            fast=fast.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
         ListNode curr=head,prev=null,temp=null;
         while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return  prev;
    }
}