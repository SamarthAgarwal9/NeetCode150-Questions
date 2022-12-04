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
    public ListNode removeNodes(ListNode head) {
        ListNode temp=reverse(head);
        ListNode res=temp;
        int max=res.val;
        while(temp.next!=null){
            if(temp.next.val<max)temp.next=temp.next.next;
            else {temp=temp.next;    max=temp.val;}
        }
        return reverse(res);
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null,curr=head,next=head.next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}