class Solution {
    public int distinctAverages(int[] nums) {
        Set<Double> set=new HashSet<>();
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        while(i<j){
            double d=(nums[i]+nums[j])/2.0;
            set.add(d);
            i++;
            j--;
        }
        return set.size();
    }
}