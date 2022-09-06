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
    int res=0;
    public int maxAncestorDiff(TreeNode root) {
        if(root==null)return 0;
        fun(root,root.val,root.val);
        return res;
    }
    void fun(TreeNode root,int min,int max){
        if(root==null)return ;
        int currmax=Math.max(Math.abs(max-root.val),Math.abs(min-root.val));
        res=Math.max(res,currmax);
        min=Math.min(min,root.val);
        max=Math.max(max,root.val);
        fun(root.left,min,max);
        fun(root.right,min,max);
    }
}