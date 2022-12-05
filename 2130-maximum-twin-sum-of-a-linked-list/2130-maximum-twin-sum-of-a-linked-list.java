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
    public int pairSum(ListNode head) {
        List<Integer> res=new ArrayList<>();
        while(head!=null){
         res.add(head.val);
            head=head.next;
        }
        int r=0,i=0,n=res.size();
        while(i<n/2){
            r=Math.max(r,res.get(i)+res.get(n-1-i));
            i++;
        }
        return r;
    }
}