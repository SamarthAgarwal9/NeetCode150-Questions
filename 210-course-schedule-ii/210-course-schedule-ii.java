class Solution {
    public int[] findOrder(int V, int[][] prerequisites) {
         ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)adj.add(new ArrayList<>());
        for(int i=0;i<prerequisites.length;i++)
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
         int[] indegree=new int[V];
        for(int i=0;i<V;i++)
            for(int ii:adj.get(i))
                indegree[ii]++;
        Queue<Integer> que=new LinkedList<>();
        int[] topo=new int[V];
        for(int i=0;i<V;i++)if(indegree[i]==0)que.add(i);
        int i=0;
        while(!que.isEmpty()){
            int node=que.poll();
            topo[i++]=node;
            for(int it:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0)que.add(it);
            }
        }
        return i==V?topo:new int[]{};
    }
}