class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n=nums.length,res=n-1;
        long[] sum=new long[n];
        sum[0]=nums[0];
        for(int i=1;i<n;i++)sum[i]=sum[i-1]+nums[i];
        long min=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            long one=sum[i]/(i+1);
            long two=(sum[n-1]-sum[i])/(n-i-1);
            long check=Math.abs(one-two);
            if(check<min){
                min=check;
                res=i;
            }
        }
        if(sum[n-1]/n <min){res=n-1;}
        return res;
    }
}