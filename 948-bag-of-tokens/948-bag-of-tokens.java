class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score=0,n=tokens.length;
        if(n==0)return 0;
        if(n==1)return power>=tokens[0]?1:0;
        Arrays.sort(tokens);
        if(power<tokens[0])return 0;
        int res=0,i=0,j=n-1;
        while(i<=j){
            if(power>=tokens[i]){
                power-=tokens[i];
                i++;
                score++;
            }
            else{
                power+=tokens[j];
                j--;
                score--;
            }
            res=Math.max(res,score);
        }
        return res;
    }
}