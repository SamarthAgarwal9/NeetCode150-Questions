class FindSumPairs {
    private int[] num1;
    private int[] num2;
    Map<Integer,Integer> mp=new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        num1=nums1;
        num2=nums2;
        for(int i:nums2)
            mp.put(i,mp.getOrDefault(i,0)+1);
    }
    
    public void add(int index, int val) {
        mp.put(num2[index],mp.get(num2[index])-1);
        num2[index]+=val;
        mp.put(num2[index],mp.getOrDefault(num2[index],0)+1);
    }
    
    public int count(int tot) {
        int res=0;
        for(int i:num1)
            if(mp.containsKey(tot-i))
                res+=mp.get(tot-i);
        return res;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */