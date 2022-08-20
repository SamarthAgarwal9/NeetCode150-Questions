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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        int carry=0,sum=0;
        ListNode res=new ListNode(-1);
        ListNode res2=res;
        while(l1!=null&&l2!=null){
             sum=carry+l1.val+l2.val;
             carry=0;
            if(sum>=10){carry=sum/10;sum=sum%10;}
            res.next=new ListNode(sum);
            res=res.next;
            l1=l1.next;
            l2=l2.next;
        }
        if(l1!=null){
            while(l1!=null){
                sum=carry+l1.val;
                carry=0;
                if(sum>=10){carry=sum/10;sum=sum%10;}
                res.next=new ListNode(sum);
                res=res.next;
                l1=l1.next;
            }
        }
        if(l2!=null){
            while(l2!=null){
                sum=carry+l2.val;
                carry=0;
                if(sum>=10){carry=sum/10;sum=sum%10;}
                res.next=new ListNode(sum);
                res=res.next;
                l2=l2.next;
            }
        }
        if(carry>0)res.next=new ListNode(carry);
        return res2.next;
    }
}