class Solution {
    public long subArrayRanges(int[] nums) {
        long res=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
             int min=nums[i],max=nums[i];
            for(int j=i;j<n;j++){
                min=Math.min(min,nums[j]);
                max=Math.max(max,nums[j]);
                res+=max-min;
            }
        }
        return res;
    }
}