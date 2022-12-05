class Solution {
    public int minMoves2(int[] nums) {
        int res=0,n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n/2;i++)
            res+=nums[n-i-1]-nums[i];
        return res;
    }
}