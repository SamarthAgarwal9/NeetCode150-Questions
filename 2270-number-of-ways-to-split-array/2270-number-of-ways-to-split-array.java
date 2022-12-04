class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        int res=0;
        long[] sum=new long[n];
        sum[0]=nums[0];
        for(int i=1;i<n;i++)sum[i]=sum[i-1]+nums[i];
        for(int i=0;i<n-1;i++){
            long one=sum[i];
            long two=sum[n-1]-sum[i];
            if(one>=two)res++;
        }

        return res;
    }
}