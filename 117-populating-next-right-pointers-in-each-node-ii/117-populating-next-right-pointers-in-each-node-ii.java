/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null|| root.left==null&&root.right==null)return root;
        Queue<Node> que=new ArrayDeque<>();
        que.add(root);
        while(!que.isEmpty()){
            int n=que.size();
            for(int i=0;i<n;i++){
                Node temp=que.poll();
                if(i<n-1)temp.next=que.peek();
                if(temp.left!=null)que.add(temp.left);
                if(temp.right!=null)que.add(temp.right);
            }
        }
        return root;
    }
   
}