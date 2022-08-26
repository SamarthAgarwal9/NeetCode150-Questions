class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int res=0;
        int[][] mat=new int[m][n];
        for(int[] i:walls)   mat[i[0]][i[1]]=2;
        for(int[] i:guards)   mat[i[0]][i[1]]=1;
    for(int r1=0;r1<m;r1++){
        for(int c1=0;c1<n;c1++){
            if(mat[r1][c1]==1){
            for(int j=c1+1;j<n;j++){
                if(mat[r1][j]==2||mat[r1][j]==1)break;
                else mat[r1][j]=3;
            }
            for(int j=c1-1;j>=0;j--){
                if(mat[r1][j]==2||mat[r1][j]==1)break;
                else mat[r1][j]=3;
            }
            for(int j=r1+1;j<m;j++){
                if(mat[j][c1]==2||mat[j][c1]==1)break;
                else mat[j][c1]=3;
            }
            for(int j=r1-1;j>=0;j--){
                if(mat[j][c1]==2||mat[j][c1]==1)break;
                else mat[j][c1]=3;
            }
        }
        }
        }
        for(int i=0;i<m;i++){
           for(int j=0;j<n;j++)
              if(mat[i][j]==0)res++;
        }
        return res;
    }
}