class Solution {
    public int longestSubarray(int[] nums) {
        int lo=1,res=0;
        for(int i:nums) res=Math.max(res,i);
        int curr=0;
        for(int i:nums){
            if(res==i)lo=Math.max(lo,++curr);
            else curr=0;
        }
        return lo;
    }
}