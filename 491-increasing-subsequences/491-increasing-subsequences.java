class Solution {
       Set<List<Integer>> res;
    public List<List<Integer>> findSubsequences(int[] nums) {
        res=new HashSet<>();
            fun(new ArrayList<>(),0,nums);
        return new ArrayList<>(res);
    }
    void fun(List<Integer> list,int ind, int[] nums){
        if(list.size()>=2)res.add(new ArrayList<>(list));
        for(int i=ind;i<nums.length;i++)
        if(list.size()==0|| list.get(list.size()-1)<=nums[i]){
            list.add(nums[i]);
            fun(list,i+1,nums);
            list.remove(list.size()-1);
        }
    }
}