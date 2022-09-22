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
class Node{
    TreeNode node;
    int ind;
    int level;
    public Node(TreeNode root,int i,int j){
        node=root;
        ind=i;
        level=j;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
       List<List<Integer>> res=new ArrayList<>();
        if(root==null)return res;
       TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> mp=new TreeMap<>();
        Queue<Node> queue=new LinkedList<>();
        queue.offer(new Node(root,0,0));
        while(!queue.isEmpty()){
            Node temp=queue.poll();
            TreeNode mynode=temp.node;
            int index=temp.ind;
            int level=temp.level;
            if(!mp.containsKey(index))
                mp.put(index,new TreeMap<>());
            if(!mp.get(index).containsKey(level))
                mp.get(index).put(level,new PriorityQueue<>());
            mp.get(index).get(level).offer(mynode.val);
            if(mynode.left!=null)queue.offer(new Node(mynode.left,index-1,level+1));
    if(mynode.right!=null)queue.offer(new     Node(mynode.right,index+1,level+1));
        }
        for(TreeMap<Integer,PriorityQueue<Integer>> tmp:mp.values()){
            res.add(new ArrayList<>());
            for(PriorityQueue<Integer> pq:tmp.values()){
                while(!pq.isEmpty()){
                    res.get(res.size()-1).add(pq.poll());
                }
            }
        }
        return res;
    }
  
}