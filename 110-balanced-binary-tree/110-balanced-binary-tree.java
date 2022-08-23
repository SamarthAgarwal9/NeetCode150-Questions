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
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        if(Math.abs(check(root.left)-check(root.right))<=1)
            return isBalanced(root.left)&&isBalanced(root.right);
        return false;
    }
    int check(TreeNode root){
        if(root==null)return 0;
        return 1+Math.max(check(root.left),check(root.right));
    }
}