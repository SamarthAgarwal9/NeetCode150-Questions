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
    public String tree2str(TreeNode root) {
        if(root==null)return "";
        StringBuilder sb=new StringBuilder();
        fun(root,sb);
        return sb.toString();
    }
    void fun(TreeNode root,StringBuilder sb){
        if(root==null) return ;
        if(root.left==null && root.right==null){
            sb.append(root.val);
            return ;
        }
        sb.append(root.val+"(");
        if(root.left!=null) {
            fun(root.left,sb);
            sb.append(")");
        }
        if(root.left==null)sb.append(")");
        if(root.right!=null) {
            sb.append("(");
            fun(root.right,sb);
            sb.append(")");
        }
    }
}