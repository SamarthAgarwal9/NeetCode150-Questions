/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null)return res;
        Queue<TreeNode> pq=new LinkedList<>();
        pq.add(root);
        res.add(root.val) ;
        while(!pq.isEmpty()){
            int size=pq.size();
            boolean flag=false;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                TreeNode temp=pq.poll();
                if(temp.left!=null){
                    if(temp.left.val>=max){max=temp.left.val;flag=true;}
                    pq.offer(temp.left);
                }
                if(temp.right!=null){
                    if(temp.right.val>=max){max=temp.right.val;flag=true;}
                    pq.offer(temp.right);
                }
            }
            if(flag)res.add(max);
        }
        return res;
    }
}