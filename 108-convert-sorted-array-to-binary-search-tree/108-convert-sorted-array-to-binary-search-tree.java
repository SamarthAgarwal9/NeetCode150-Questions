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
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        return check(nums,0,n-1);
    }
    TreeNode check(int[] nums,int l,int r){
        if(l>r)return null;
        int mid=(l+r)/2;
        TreeNode res=new TreeNode(nums[mid]);
        res.left=check(nums,l,mid-1);
        res.right=check(nums,mid+1,r);
        return res;
    }
}