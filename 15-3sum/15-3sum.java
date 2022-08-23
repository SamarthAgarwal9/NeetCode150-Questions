class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int one=i+1,two=nums.length-1;
            while(one<two){
            List<Integer> res=new ArrayList<>();
                int sum=nums[one]+nums[two]+nums[i];
                if(sum==0){ 
                res.add(nums[i]);
                res.add(nums[one++]);
                res.add(nums[two--]);
                ans.add(res);
                }
                else if(sum<0)one++;
                else if(sum>0)two--;
            }
        }
        return new ArrayList<>(ans); 
    }
}