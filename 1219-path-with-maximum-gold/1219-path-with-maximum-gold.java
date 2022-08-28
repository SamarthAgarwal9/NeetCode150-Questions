class Solution {
    public int getMaximumGold(int[][] grid) {
        int row=grid.length,col=grid[0].length;
        boolean[][] visit=new boolean[row][col];
         int max=0;
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                if(grid[i][j]!=0)
                   max=Math.max(max,solve(grid,i,j,visit));
        return max;
    }
    static int solve(int[][] grid,int i,int j,boolean[][] visit){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||visit[i][j]||grid[i][j]==0)return 0;
        visit[i][j]=true;
        int down=solve(grid,i+1,j,visit);
        int right=solve(grid,i,j+1,visit);
        int up=solve(grid,i-1,j,visit);
        int left=solve(grid,i,j-1,visit);
        visit[i][j]=false;
        return Math.max(up,(Math.max(down,Math.max(right,left))))+grid[i][j];
    }
}