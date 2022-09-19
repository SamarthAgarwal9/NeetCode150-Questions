class Solution {
    public int minDistance(String word1, String word2) {
        int n1=word1.length(),n2=word2.length();
        int[][] dp=new int[n1+1][n2+1];
        for(int i=0;i<n1;i++)dp[i+1][0]=i+1;
        for(int j=0;j<n2;j++)dp[0][j+1]=j+1;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(word1.charAt(i)==word2.charAt(j))
                    dp[i+1][j+1]=dp[i][j];
                else 
                    dp[i+1][j+1]=1+Math.min(dp[i][j],Math.min(dp[i+1][j],dp[i][j+1]));
            }
        }
        return dp[n1][n2];
    }
    
}