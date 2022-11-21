class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int r=maze.length,c=maze[0].length;
        int res=0;
        Queue<int[]> qu=new LinkedList<>();
        qu.offer(entrance);
        maze[entrance[0]][entrance[1]]='+';
        int[][] dir={{0,1},{1,0},{-1,0},{0,-1}};
        int x,y;
        while(!qu.isEmpty()){
            res++;
            int n=qu.size();
            for(int i=0;i<n;i++){
                int[] curr=qu.poll();
                for(int[] d:dir){
                    int ri=d[0]+curr[0];
                    int ci=d[1]+curr[1];
                    if(ri<0 ||ci<0||ri>=r||ci>=c||maze[ri][ci]=='+')continue;
                    if(ri==0||ci==0||ri==r-1||ci==c-1)return res;
                    maze[ri][ci]='+';
                    qu.add(new int[]{ri,ci});
                }
            }
        }
            return -1;
    }
}