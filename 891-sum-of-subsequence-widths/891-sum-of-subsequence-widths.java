class Solution {
    public int sumSubseqWidths(int[] nums) {
        int n=nums.length;
        if(n==1)return 0;
        if(n==2)return Math.abs(nums[0]-nums[1]);
        Arrays.sort(nums);
        long[] prev=new long[n];
        for(int i=0;i<n;i++) 
            prev[i]=i==0?nums[i]:nums[i]+prev[i-1];
        int res=0,two=1,mod=1000000007;
        for(int i=1;i<n;i++){
            long suffix=prev[n-1]-prev[i-1];
            long prefix=prev[n-i-1];
            res+=two*(suffix-prefix)%mod;
            res%=mod;
            two=two*2 %mod;
        }
        return res;
    }
}