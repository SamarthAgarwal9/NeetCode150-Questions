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
    List<TreeNode> res;
    HashSet<Integer> set;
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        if(to_delete.length==0)return res;
        res=new ArrayList<>();
        set=new HashSet<>();
        for(int i:to_delete)
            set.add(i);
        fun(root,true);
        return res;
    }
    TreeNode fun(TreeNode root,boolean rootNode){
        if(root==null)return null;
        boolean del=set.contains(root.val);
        if(rootNode && !del)res.add(root);
        root.left=fun(root.left,del);
        root.right=fun(root.right,del);
        return del?null:root;
    }
}