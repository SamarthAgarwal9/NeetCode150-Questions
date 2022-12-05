class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int res=0,min=nums[0];
        for(int i:nums)min=Math.min(min,i);
        for(int i:nums)res+=i-min;
        return res;
    }
}