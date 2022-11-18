class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr=new int[m][n];
        for(int[] i:indices){
            int r=i[0];
            int c=i[1];
            for(int j=0;j<n;j++)arr[r][j]++;
            for(int j=0;j<m;j++)arr[j][c]++;
        }
        int res=0;
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                if(arr[i][j]%2!=0)res++;
        return res;
    }
}