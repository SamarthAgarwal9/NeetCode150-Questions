class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int len=queries.length;
        int[] res=new int[len];
        for(int i=0;i<len;i++){
            int count=0;
            int rad=queries[i][2]*queries[i][2];
            for(int[] poin:points)
            if(coordinate(poin,queries[i])<=rad)count++;
               res[i]=count;
        }
    return res;
    }
    public int coordinate(int[] poin,int[] que){
        int x=poin[0]-que[0];
        int y=poin[1]-que[1];
        return x*x+y*y;
    }
}