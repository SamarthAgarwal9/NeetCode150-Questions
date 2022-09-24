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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        fun(res,li,root,targetSum);
        return res;
    }
    void fun(List<List<Integer>> res,List<Integer> li, TreeNode root,int sum){
        if(root==null)return;
        if(root.left==null&&root.right==null && sum==root.val){
            li.add(root.val);
            res.add(new ArrayList<>(li));
        li.remove(li.size()-1);
            return;
        }
        if(root.left!=null){
            li.add(root.val);
            fun(res,li,root.left,sum-root.val);
            li.remove(li.size()-1);
        }
        if(root.right!=null){
            li.add(root.val);
            fun(res,li,root.right,sum-root.val);
            li.remove(li.size()-1);
        }
    }
}