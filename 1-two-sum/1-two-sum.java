class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ind1=-1,ind2=-1;
       Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(target-nums[i])){
                ind1=i;
              ind2=mp.get(target-nums[i]);
            }
            mp.put(nums[i],i);
        }
        return new int[]{ind1,ind2}; 
    }
}