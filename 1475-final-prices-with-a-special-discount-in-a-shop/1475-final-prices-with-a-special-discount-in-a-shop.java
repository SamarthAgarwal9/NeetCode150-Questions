class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int[] res=new int[n];
        for(int i=0;i<n-1;i++){
            res[i]=prices[i];
            for(int j=i+1;j<n;j++){
                if(prices[j]<=res[i]){
                    res[i]-=prices[j];
                    break;
                }
            }
        }
        res[n-1]=prices[n-1];
        return res;
    }
}