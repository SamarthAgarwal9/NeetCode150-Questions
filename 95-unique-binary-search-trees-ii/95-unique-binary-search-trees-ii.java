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
    public List<TreeNode> generateTrees(int n) {
        return myfun(1,n);
    }
    public List<TreeNode> myfun(int start,int end){
        List<TreeNode> res=new ArrayList<>(); 
        if(start>end){
            res.add(null);
            return res;
        }
        if(start==end){
            res.add(new TreeNode(start));
            return res;
        }
        
        for(int i=start;i<=end;i++){
            List<TreeNode> left=myfun(start,i-1);
            List<TreeNode> right=myfun(i+1,end);
            for(TreeNode t1:left){
                for(TreeNode t2:right){
                TreeNode root=new TreeNode(i);
                root.left=t1;
                root.right=t2;
                res.add(root);
                }
            }
        }
        return res;
    }
}