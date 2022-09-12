class Solution {
    public List<Integer> intersection(int[][] nums) {
        int c=nums[0].length,r=nums.length;
        List<Integer> l=new ArrayList<>();
        int[] count=new int[1001];
        for(int[] i:nums)
            for(int ii: i)
                count[ii]++;
        for(int i=0;i<count.length;i++)
            if(count[i]==nums.length) l.add(i);
        return l;
        
    }
}