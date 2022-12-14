/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<Node> q=new LinkedList();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> li=new LinkedList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                Node n1=q.poll();
                li.add(n1.val);
                for(Node ind:n1.children){
                    q.offer(ind);
                }
            }
            res.add(li);
        }
        return res;
    }
}