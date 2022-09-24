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
    public int countNodes(TreeNode root) {
        if(root==null)return 0;
        int lh=heightleft(root);
        int rh=heightright(root);
        if(lh==rh)return (2<<lh)-1;
        else return 1+countNodes(root.left)+countNodes(root.right);
    }
    int heightleft(TreeNode root){
        if(root==null)return 0;
        int cnt=0;
        while(root.left!=null){
            cnt++;
            root=root.left;
        }
        return cnt;
    }
    int heightright(TreeNode root){
        if(root==null)return 0;
        int cnt=0;
        while(root.right!=null){
            cnt++;
            root=root.right;
        }
        return cnt;
    }
}