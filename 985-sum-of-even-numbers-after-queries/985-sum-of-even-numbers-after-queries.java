class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum=0;
        int[] res=new int[nums.length];
        for(int i:nums)if(i%2==0)sum+=i;
        int n=queries.length;
        int j=0;
        for(int i=0;i<n;i++){
            int ind=queries[i][1];
            if(nums[ind]%2==0)sum-=nums[ind];
            int newval=nums[ind]+queries[i][0];
            if(newval%2==0)sum+=newval;
            nums[ind]=newval;
            res[j++]=sum;
        }
        return res;
    }
}