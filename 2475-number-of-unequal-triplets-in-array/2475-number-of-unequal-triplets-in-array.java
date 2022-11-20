class Solution {
    public int unequalTriplets(int[] nums) {
        int res=0,n=nums.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++)
                    if(i<j &&j<k && nums[i] != nums[j]&& nums[i] != nums[k]&&nums[j] != nums[k]) res++;
            }
        }
        return res;
    }
}