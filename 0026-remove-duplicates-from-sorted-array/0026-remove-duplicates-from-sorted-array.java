class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> s=new LinkedHashSet<>();
        int k=0;
        for(int i:nums)
            if(!s.contains(i)){s.add(i);
            nums[k++]=i;
        }
        return s.size();
    }
}