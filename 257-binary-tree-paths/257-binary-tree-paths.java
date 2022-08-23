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
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null) return new ArrayList<String>();
        List<String> res=new ArrayList<>();
        check(res,root,Integer.toString(root.val));
        return res;
    }
    void check(List<String> res,TreeNode root,String str){
        if(root.left==null&&root.right==null) res.add(str);
        if(root.left!=null) check(res,root.left,str+"->"+root.left.val);
        if(root.right!=null) check(res,root.right,str+"->"+root.right.val);
        }
}