class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length,col=matrix[0].length;
        for(int i=0;i<row;i++){
            if(target>matrix[i][col-1])continue;
            else if(target == matrix[i][col-1] || target==matrix[i][0])return true;
            else{
                for(int j=1;j<col-1;j++){
                    if(matrix[i][j]==target)return true;
                }
            }
        }
        return false;
    }
}