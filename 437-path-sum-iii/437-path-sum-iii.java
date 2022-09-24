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
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)return 0;
        fun(root,targetSum,0);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
        return res;
    }
    void fun(TreeNode root, int tsum,int sum){
        if(root==null)return ;
        int csum=(sum+root.val)%1000000007;
        if(tsum==csum)res++;
        fun(root.left,tsum,csum);
        fun(root.right,tsum,csum);
    }
}