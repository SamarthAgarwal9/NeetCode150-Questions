class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int r=matrix.length,c=matrix[0].length;
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                if(i>0&&j>0&&matrix[i][j]!=matrix[i-1][j-1])return false;
        return true;
    }
}