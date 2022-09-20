class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int len1=nums1.length,len2=nums2.length;
        if(len1==0||len2==0)return 0;
        int count=0;
        int[][] dp=new int[len1+1][len2+1];    
        for(int i=len1-1;i>=0;i--){
            for(int j=len2-1;j>=0;j--){
                if(nums1[i]==nums2[j]){
                    dp[i][j]=dp[i+1][j+1]+1;
                    count=Math.max(count,dp[i][j]); 
                }
            }
        }
        return count;
    }
}