class Solution {
    public int waysToSplit(int[] nums) {
        int n=nums.length;
        int res=0;
        long[] sum=new long[n];
        sum[0]=nums[0];
        for(int i=1;i<n;i++)sum[i]=sum[i-1]+nums[i];
        for (int i = 0, j = 0, k = 0; i < n - 2; ++i) {
        while (j <= i || (j < n - 1 && sum[j] < sum[i] * 2))
            ++j;
        while (k < j || ( k < n - 1 && sum[k] - sum[i] <= sum[n - 1] - sum[k]))
            ++k;
        res = (res + k - j) % 1000000007;
    }    
        return res;
    }
}