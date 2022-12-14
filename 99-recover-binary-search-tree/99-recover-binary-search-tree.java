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
    TreeNode first;
    TreeNode prev;
    TreeNode mid;
    TreeNode last;
    public void recoverTree(TreeNode root) {
        if(root==null)return; 
        first=mid=last=null;
        prev=new TreeNode(Integer.MIN_VALUE);
        inorder(root);
        if(first!=null && last!=null ){
            int temp=first.val;
            first.val=last.val;
            last.val=temp;
        }
        else if(first!=null && mid!=null ){
            int temp=first.val;
            first.val=mid.val;
            mid.val=temp;
        }
    }
    private void inorder(TreeNode root){
        if(root==null)return; 
        inorder(root.left);
        if(prev!=null && root.val<prev.val){
            if(first==null){
                first=prev;
                mid=root;
            }
            else last=root;
        }
        prev=root;
        inorder(root.right);
    }
}