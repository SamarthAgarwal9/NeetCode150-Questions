class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        Set<Integer> li=new HashSet<>();
        for(int i:nums1)s1.add(i);
        for(int i:nums2)s2.add(i);
        for(int i:s1)if(s2.contains(i))li.add(i);
        int[] res=new int[li.size()];
        int k=0;
        for(int i:li)res[k++]=i;
        return res;
    }
}