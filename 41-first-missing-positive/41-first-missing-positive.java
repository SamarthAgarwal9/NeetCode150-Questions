class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        //List<Integer> li=new ArrayList<>();
        int l=1;
        for(int i:nums){
            if(i<=0)continue;
            else{
                if(i>l) return l;
                else if(i==l)l++;
            }
        }
        return l;
    }
}