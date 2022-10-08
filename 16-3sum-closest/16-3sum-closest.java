class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length,ans=0,first=0,start=-1,end=-1;
        int diff=Integer.MAX_VALUE;
        for(int i = 0 ; i < n-2; i++){
                first = nums[i];
            start=i+1;
            end=n-1;
            while(start<end){
                int sum=first+nums[start]+nums[end];
                if(sum==target)return target;
                else if(Math.abs(sum-target)<diff){
                    diff=Math.abs(sum-target);
                    ans=sum;
                }
                if(target<sum)end--;
                else start++;
            }
        }
        return ans;
    }
}