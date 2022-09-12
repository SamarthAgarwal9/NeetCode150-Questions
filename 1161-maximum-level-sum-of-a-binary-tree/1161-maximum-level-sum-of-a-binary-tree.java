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
    public int maxLevelSum(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        Queue<TreeNode> que=new ArrayDeque<>();
        if(root==null)return 0;
        if(root.left==null && root.right==null ) return 1;
        
        que.add(root);
        while(!que.isEmpty()){
            int size=que.size();
            int sum=0;
            for(int i=0;i<size;i++){
                TreeNode n=que.poll();
                sum+=n.val;
                if(n.left!=null)que.add(n.left);
                if(n.right!=null)que.add(n.right);
            }
            l.add(sum);
        }
        System.out.println(l);
        int res=0,max=Integer.MIN_VALUE;
        for(int i=0;i<l.size();i++){
            if(max<l.get(i)){res=i;max=l.get(i);}
        }
        return res+1;
    }
}