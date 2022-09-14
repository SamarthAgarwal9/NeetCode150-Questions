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
    public int pseudoPalindromicPaths (TreeNode root) {
        return dfs(root,new HashSet<>());
    }
    int dfs(TreeNode root,Set<Integer> mp){
        if(root==null)return 0;
        if(mp.contains(root.val)) mp.remove(root.val);
        else mp.add(root.val);
        if(root.left==null && root.right==null)return mp.size()<=1?1:0;
        return dfs(root.left,new HashSet<>(mp))+dfs(root.right,new HashSet<>(mp));
    }
}