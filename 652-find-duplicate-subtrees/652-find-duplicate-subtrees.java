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
    Map<String,Integer> mp=new HashMap<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res=new ArrayList<>();
        fun(root,res);
        return res;
    }
    String fun(TreeNode root, List<TreeNode> res){
        if(root==null)return "N";
        String left=fun(root.left,res);
        String right=fun(root.right,res);
        String str=root.val+" "+left+" "+right;
        mp.put(str,mp.getOrDefault(str,0)+1);
        if(mp.get(str)==2)res.add(root);
        return str;
    }
}