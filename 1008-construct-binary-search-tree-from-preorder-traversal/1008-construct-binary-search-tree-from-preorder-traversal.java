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
    int i=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return dfs(preorder,Integer.MAX_VALUE);
    }
    TreeNode dfs(int[] preorder,int maxVal){
        if(i==preorder.length || preorder[i]>maxVal)return null;
        TreeNode root=new TreeNode(preorder[i++]);
        root.left=dfs(preorder,root.val);
        root.right=dfs(preorder,maxVal);
        return root;
    }
}