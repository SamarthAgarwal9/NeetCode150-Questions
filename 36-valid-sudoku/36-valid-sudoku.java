class Solution {   
     public boolean isValidSudoku(char[][] board) {
        HashSet<String> check=new HashSet<>();
        for(int i=0;i<9;i++)
            for(int j=0;j<9;j++)
               if(board[i][j]!='.')
            if(!check.add("row"+i+board[i][j]) || !check.add("col"+j+board[i][j]) || !check.add("box"+((i/3)*3+j/3)+board[i][j]))return false;
            return true;
     }
    
}