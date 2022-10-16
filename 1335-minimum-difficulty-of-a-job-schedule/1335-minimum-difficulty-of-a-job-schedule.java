class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int res=0,n=jobDifficulty.length;
        if(d>n)return -1;
        // if(d==n){
        //     int sum=0;
        //     for(int i:jobDifficulty)
        //         sum+=i;
        //     return sum;
        // }
        int[][] dp=new int[n][d+1];
        for(int[] i:dp)
            Arrays.fill(i,-1);
        return dfs(dp,jobDifficulty,d,0);
    }
    int dfs(int[][] dp, int[] job,int d,int l){
        int n=job.length;
        if(d==0&&n==l)return 0;
        if(d==0||n==l)return Integer.MAX_VALUE;
        if(dp[l][d]!=-1) return dp[l][d];
        int curr=job[l];
        int min=Integer.MAX_VALUE;
        for(int i=l;i<n;i++){
            curr=Math.max(curr,job[i]);
            int temp=dfs(dp,job,d-1,i+1);
            if(temp!=Integer.MAX_VALUE)
                min=Math.min(min,temp+curr);
        }
        return dp[l][d]=min;
    }
}