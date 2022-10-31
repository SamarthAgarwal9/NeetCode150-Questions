class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<index.length;i++){
            li.add(index[i],nums[i]);
        }
        int[] res=new int[index.length];
        int l=0;
        for(int i:li)
            res[l++]=i;
        return res;
    }
}