class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> res=new ArrayList<>();
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                for(int j=0;j<nums.length;j++){
                    if(Math.abs(j-i)<=k)s.add(j);
                }
            }
        }
        for(int i:s)res.add(i);
        Collections.sort(res);
        return res;
    }
}