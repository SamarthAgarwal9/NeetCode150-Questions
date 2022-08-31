class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(i>0&&nums[i]==nums[i-1])continue;
            int one=i+1,two=nums.length-1;
            while(one<two){
            List<Integer> res=new ArrayList<>();
                int sum=nums[one]+nums[two]+nums[i];
                 if(sum<0)one++;
                else if(sum>0)two--;
                else { 
                res.add(nums[i]);
                res.add(nums[one]);
                res.add(nums[two]);
                ans.add(res);
               while(one<nums.length-1 && nums[one]==nums[one+1])one++;
            while(two>0 && nums[two]==nums[two-1])two--;;
                one++;two--;
                }
            }
        }
        return ans; 
    }
}