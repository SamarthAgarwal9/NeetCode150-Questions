class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums)set.add(i);
        Arrays.sort(nums);
        int res=0;
        for(int i:nums){
            if(i<0 && set.contains((i)*(-1)))return (i)*(-1);
            if(i>0)return -1;
        }
        return -1;
    }
}