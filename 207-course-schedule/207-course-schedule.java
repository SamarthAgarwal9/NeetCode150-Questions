class Solution {
    public boolean canFinish(int n, int[][] pre) {
        List<List<Integer>> li=new ArrayList<>();
        for(int i=0;i<n;i++)li.add(new ArrayList<>());
        for(int i=0;i<pre.length;i++)li.get(pre[i][1]).add(pre[i][0]);
        int[] indegree=new int[n];
        for(int i=0;i<n;i++)
            for(int ii:li.get(i))
                indegree[ii]++;
        Queue<Integer> que=new LinkedList<>();
        for(int i=0;i<n;i++)if(indegree[i]==0)que.add(i);
        int ct=0;
        while(!que.isEmpty()){
            int t=que.poll();
            for(int it:li.get(t))
                if(--indegree[it]==0)que.add(it);
            ct++;
        }
        return ct==n;
    }
}