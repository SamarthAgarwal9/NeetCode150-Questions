class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean > res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i==0){
                if(nums[i]==0)res.add(true);
                else res.add(false);
            }
            else{
                nums[i]=(nums[i-1]*2+nums[i])%5;
                res.add(nums[i]==0||nums[i]==5);
            }
        }
        return res;
    }
}