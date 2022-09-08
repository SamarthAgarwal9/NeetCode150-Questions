class Solution {
    public boolean findSubarrays(int[] nums) {
     int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n-1;j++){
                if(nums[i+1]+nums[i]==nums[j]+nums[j+1])
                    return true;
            }
        }
        return false;
    }
}