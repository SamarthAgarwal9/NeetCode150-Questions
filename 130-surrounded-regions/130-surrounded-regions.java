class Solution {
    public void solve(char[][] board) {
        int r=board.length;
        int c=board[0].length;
        if(r<2||c<2)return;
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                if(board[i][j]=='O' && (i==0||j==0||i==r-1||j==c-1))
                    check_visit_status(board,i,j,r,c);
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                if(board[i][j]=='T')board[i][j]='O';
                else if(board[i][j]=='O') board[i][j]='X';

        }
     void check_visit_status(char[][] board,int i,int j,int row,int col){
        if(i<0||j<0||i>row-1||j>col-1||board[i][j]!='O')return;
        board[i][j]='T';
        check_visit_status(board,i+1,j,row,col);
        check_visit_status(board,i,j+1,row,col);
        check_visit_status(board,i-1,j,row,col);
        check_visit_status(board,i,j-1,row,col);
    }
     
}