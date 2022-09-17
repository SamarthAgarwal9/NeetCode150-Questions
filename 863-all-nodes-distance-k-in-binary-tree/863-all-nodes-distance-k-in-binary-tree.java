/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> res=new ArrayList<>();
        Map<TreeNode,TreeNode> mp=new HashMap<>();
        buildParentMap(root,root,mp);
        Set<TreeNode> set=new HashSet<>();
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(target);
        set.add(target);
        int level=0;
        while(que.size()>0){
            int size=que.size();
            if(level==k)return queToList(que);
            for(int i=0;i<size;i++){
                TreeNode temp=que.remove();
                if(temp.left!=null && !set.contains(temp.left)){
                    que.offer(temp.left);
                    set.add(temp.left);
                }
                if(temp.right!=null && !set.contains(temp.right)){
                    que.offer(temp.right);
                    set.add(temp.right);
                }
                TreeNode parent=mp.get(temp);
                if(!set.contains(parent)){
                    que.offer(parent);
                    set.add(parent);
                }
                
            }
            level++;
        }
        return res;
    }
    private void buildParentMap(TreeNode root,TreeNode parent,Map<TreeNode,TreeNode> mp){
        if(root == null)return;
        mp.put(root,parent);
        buildParentMap(root.left,root,mp);
        buildParentMap(root.right,root,mp);
    }
    private List<Integer> queToList(Queue<TreeNode> que){
        List<Integer> res=new ArrayList<>();
        while(!que.isEmpty())
            res.add(que.poll().val);
        return res;
    }
}