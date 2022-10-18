class Solution {
    public int maxWidthRamp(int[] nums) {
        int n=nums.length;
        int[] next=new int[n];
        next[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--)
            next[i]=Math.max(next[i+1],nums[i]);
        int l=0,r=0,res=0;
        while(r<n){
            while(l<r && nums[l]>next[r])l++;
            res=Math.max(res,r-l);
            r++;
        }
        return res;
    }
}