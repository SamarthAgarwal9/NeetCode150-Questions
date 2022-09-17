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
    HashMap<Integer,ArrayList<Integer>> mp=new HashMap<>();
    public int amountOfTime(TreeNode root, int start) {
        if(root==null)return 0;
        if(root.left==null && root.right==null)return 0;
        designGraph(root,-1);
        Queue<Integer> que=new LinkedList<>();
        que.offer(start);
        int res=0;
        Set<Integer> set=new HashSet<>();
        set.add(start);
        while(que.size()>0){
            int size=que.size();
            while(size-->0){
                int temp=que.poll();
                if(!mp.containsKey(temp))continue;
                for(int i:mp.get(temp)){
                    if(!set.contains(i)){
                        que.offer(i);
                        set.add(i);
                    }
                }
            }
            res++;
        }
        return res-1;
        
    }
    void designGraph(TreeNode root,int par){
        if(root==null)return;
        if(par!=-1){
            if(!mp.containsKey(root.val)){
                ArrayList<Integer> arr=new ArrayList();
                arr.add(par);
                mp.put(root.val,arr);
            }
            else{
                ArrayList<Integer> arr=mp.get(root.val);
                arr.add(par);
                mp.put(root.val,arr);
            }
            if(!mp.containsKey(par)){
                ArrayList<Integer> arr=new ArrayList();
                arr.add(root.val);
                mp.put(par,arr);
            }
            else{
                 ArrayList<Integer> arr=mp.get(par);
                arr.add(root.val);
                mp.put(par,arr);
            }
        }
        designGraph(root.left,root.val);
        designGraph(root.right,root.val);
    }
}