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
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        return fun(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    boolean fun(TreeNode root,long v1,long v2){
        if(root==null)return true;
         if( root.val<=v1 || root.val>=v2)return false;
        return fun(root.left,v1,root.val)&&fun(root.right,root.val,v2);
    }
}