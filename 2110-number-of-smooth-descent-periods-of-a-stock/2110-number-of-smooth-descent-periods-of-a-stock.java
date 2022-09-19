class Solution {
    public long getDescentPeriods(int[] prices) {
        int n=prices.length;
        long res=1,j=1; 
        for(int i=1;i<n;i++){
            if(prices[i]+1==prices[i-1])j++;
            else j=1;
            res+=j;
        }
        return res;
    }
}