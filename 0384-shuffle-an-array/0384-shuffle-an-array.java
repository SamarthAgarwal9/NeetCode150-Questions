class Solution {
    List<Integer> li;
    public Solution(int[] nums) {
        li=new ArrayList<Integer>();
        for(int i:nums)li.add(i);
    }
    
    public int[] reset() {
        int[] res=new int[li.size()];
        int l=0;
        for(int i:li){
            res[l++]=i;
        }
        return res;
    }
    
    public int[] shuffle() {
        List<Integer> sh=new ArrayList<>(li);
        Collections.shuffle(sh);
         int[] res=new int[li.size()];
        int l=0;
        for(int i:sh){
            res[l++]=i;
        }
        return res;
        

    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */