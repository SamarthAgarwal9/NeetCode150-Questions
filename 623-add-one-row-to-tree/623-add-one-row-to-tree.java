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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(root==null)return new TreeNode(val);
        if(depth==1){
            TreeNode temp=new TreeNode(val);
            temp.left=root;
            return temp;
        }
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        while(--depth>1){
            Queue < TreeNode > q = new LinkedList < > ();
            while(!que.isEmpty()){
                TreeNode temp=que.poll();
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
            }
            que=q;
        }
        while(que.size()>0){
           TreeNode temp=que.poll();
            TreeNode left=temp.left,right=temp.right;
            temp.left=new TreeNode(val);
            temp.right=new TreeNode(val);
            temp.left.left=left;
            temp.right.right=right;
        }
        return root;
    }
}