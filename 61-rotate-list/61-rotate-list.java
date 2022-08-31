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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null ||k==0)return head;
        ListNode curr=head;
        int size=0;
        while(curr!=null){curr=curr.next;size++;}
        curr=head;
        int c=size-(k%size);
        if(c==0)return head;
        for(int i=0;i<c-1;i++){
            curr=curr.next;
        }
        if(curr.next==null)return head; 
        ListNode headCpy=curr.next;
        curr.next=null;
        curr=headCpy;
        while(curr.next!= null){
            curr=curr.next;
        }
        curr.next=head;
        return headCpy;
    }
    
}