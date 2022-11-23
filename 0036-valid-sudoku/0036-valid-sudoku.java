class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++)
                if(board[i][j]!='.'){
                    if(!hs.add("row"+i+board[i][j]) || !hs.add("col"+j+board[i][j]) || !hs.add("mat"+(i-i%3)+" "+(j-j%3)+board[i][j]))return false;
                }
    return true;
    }
}