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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> pq=new ArrayList<>();
        for(ListNode l1:lists){
            ListNode head=l1;
            while(l1!=null){
                pq.add(l1.val);
                l1=l1.next;
            }
        }
        Collections.sort(pq);
        ListNode ans=new ListNode();
        ListNode res=ans;
        for(int i:pq){
            ans.next=new ListNode(i);
            ans=ans.next;
        }
        return res.next;
    }
}