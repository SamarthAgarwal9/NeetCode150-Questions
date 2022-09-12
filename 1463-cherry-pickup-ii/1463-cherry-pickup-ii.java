class Solution {
    public int cherryPickup(int[][] grid) {
        int row=grid.length,col=grid[0].length; 
        int[][][] dp=new int[row][col][col];
        for(int i=row-1;i>=0;i--)
             for(int j=0;j<col;j++)
                 for(int k=0;k<col;k++){
                     int res=0;
                     res+=grid[i][j];
                     if(j!=k) res+=grid[i][k];
                     if(i!=row-1){
                         int maxi=0;
                        for(int x=j-1;x<=j+1;x++)
                            for(int y=k-1;y<=k+1;y++)
                                if(x>=0&&y>=0&&x<col&&y<col)
                                    maxi=Math.max(maxi,dp[i+1][x][y]);
                         res+=maxi;
                     }
                     dp[i][j][k]=res;
                 }
        return dp[0][0][col-1];
    }
}