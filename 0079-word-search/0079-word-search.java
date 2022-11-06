class Solution {
    public boolean exist(char[][] board, String word) {
        int r=board.length,c=board[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(word.charAt(0)==board[i][j]) 
                    if(dfs(i,j,board,word,0)==true) return true;
            }
        }
        return false;
    }
    public boolean dfs(int i,int j, char[][] board,String str,int ind){
        if(ind==str.length())return true;
        if(i<0||j<0||i>=board.length||j>=board[0].length||str.charAt(ind)!=board[i][j]||board[i][j]=='@')
            return false;
        char ch=board[i][j];
        board[i][j]='@';
        if(dfs(i+1,j,board,str,ind+1)||dfs(i-1,j,board,str,ind+1)||dfs(i,j+1,board,str,ind+1)||    dfs(i,j-1,board,str,ind+1)) return true;
        board[i][j]=ch;
        return false;
    }
}