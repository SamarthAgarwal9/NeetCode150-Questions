class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int res=0,m=grid1.length,n=grid1[0].length;
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                if(grid2[i][j]==1)
                    res+=dfs(grid1,grid2,i,j,m,n);
        return res;
    }
    public int dfs(int[][] grid1,int[][] grid2,int i,int j,int m,int n){
        if(i<0||j<0||i==m||j==n||grid2[i][j]==0)return 1;
        int res=1;
        grid2[i][j]=0;
        res&=dfs(grid1,grid2,i+1,j,m,n);
        res&=dfs(grid1,grid2,i,j+1,m,n);
        res&=dfs(grid1,grid2,i-1,j,m,n);
        res&=dfs(grid1,grid2,i,j-1,m,n);
        return res&grid1[i][j];
    }
}