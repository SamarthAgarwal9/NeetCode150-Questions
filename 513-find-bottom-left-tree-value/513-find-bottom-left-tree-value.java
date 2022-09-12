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
    public int findBottomLeftValue(TreeNode root) {
        if(root==null)return -1;
        Queue<TreeNode> que=new ArrayDeque<>();
        que.offer(root);
        int res=-1;
        while(!que.isEmpty()){
            int size=que.size();
            TreeNode temp=que.poll();
            res=temp.val;
            if(temp.left!=null)que.offer(temp.left);
            if(temp.right!=null)que.offer(temp.right);
            for(int i=1;i<size;i++){
                TreeNode tem=que.poll();
            if(tem.left!=null)que.offer(tem.left);
            if(tem.right!=null)que.offer(tem.right);
            }
        }
        return res;
    }
}