class Solution {
    public int numIslands(char[][] grid) {
        int row=grid.length,res=0;
        int col=grid[0].length;
        if(row==0||col==0)return 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    check_visit_status(grid,i,j,row,col);
                    res+=1;
                }
            }
        }
        return res;
    }
    void check_visit_status(char[][] grid,int i,int j,int row,int col){
        if(i<0||j<0||i>=row||j>=col||grid[i][j]=='2'||grid[i][j]=='0')return;
        grid[i][j]='2';
        check_visit_status(grid,i+1,j,row,col);
        check_visit_status(grid,i,j+1,row,col);
        check_visit_status(grid,i-1,j,row,col);
        check_visit_status(grid,i,j-1,row,col);
    }
}