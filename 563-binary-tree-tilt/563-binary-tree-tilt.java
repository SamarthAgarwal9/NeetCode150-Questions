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
    public int findTilt(TreeNode root) {
           int[] ret = new int[1];
    helper(root, ret);
    return ret[0];
}
    
private int helper(TreeNode node, int[] ret){
    if(node == null){
        return 0;
    }
    int l_sum = helper(node.left, ret);
    int r_sum = helper(node.right, ret);
    ret[0] += Math.abs(l_sum - r_sum);
    return l_sum + r_sum + node.val;
}
}