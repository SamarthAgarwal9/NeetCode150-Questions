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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res=new ArrayList<>();
        if(root==null)return res;
        // if(root.left==null&&root.right==null)return res.add((double)root.val);
        Queue<TreeNode> que=new ArrayDeque<>();
        que.add(root);
        while(!que.isEmpty()){
            int size=que.size();
            double sum=0;
            for(int i=0;i<size;i++){
                TreeNode temp=que.poll();
                sum+=temp.val;
                if(temp.left!=null)que.add(temp.left);
                if(temp.right!=null)que.add(temp.right);
            }
            sum=sum/size;
            res.add(sum);
        }
        return res;
        
    }
}