class Solution {
    int res=0;
    public int orangesRotting(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        if(grid==null||row==0)return 0;
        Queue<int[]> que=new LinkedList<>();
        int count1=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2)que.offer(new int[]{i,j});
                else if(grid[i][j]==1)count1++;
            }
        }
        if(count1==0)return 0;
        if(que.isEmpty())return -1;
        int[][] dir={{-1,0},{1,0},{0,1},{0,-1}};
        int count=0;
        while(!que.isEmpty()){
            ++count;
            int size=que.size();
            for(int i=0;i<size;i++){
                int[] temp=que.poll();
                for(int[] direct:dir){
                    int x=direct[0]+temp[0];
                    int y=direct[1]+temp[1];
                    if(x<0||y<0||x>=row||y>=col||grid[x][y]!=1)
                        continue;
                    grid[x][y]=2;
                    que.offer(new int[]{x,y});
                    count1--;    
                }
            }
        }
        return count1==0?count-1:-1;
    }
    
}