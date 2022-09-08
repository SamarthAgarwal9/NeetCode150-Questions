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
    int res=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root==null)return 0;
        if(root.left==null&&root.right==null)return root.val;
        fun(root);
        return res;
    }
    int fun(TreeNode root){
        if(root==null)return 0;
        int left=Math.max(0,fun(root.left));
        int right=Math.max(0,fun(root.right));
        res=Math.max(root.val+left+right,res);
        return Math.max(left,right)+root.val;
    }
}