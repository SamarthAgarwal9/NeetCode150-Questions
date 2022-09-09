class Solution {
    public int lengthOfLIS(int[] nums) {
        int n =nums.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,1);
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=i-1;j++){
                if(nums[i]>nums[j])
                dp[i]=Math.max(1+dp[j],dp[i]);
            }
        }
        int res=0;
        for(int i:dp)res=Math.max(res,i);
        return res;
    }
}