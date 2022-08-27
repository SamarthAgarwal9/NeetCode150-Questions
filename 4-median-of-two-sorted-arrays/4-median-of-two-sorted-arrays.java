class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
        List<Integer> li=new ArrayList<>();
        int i=0,j=0;
        while(i<n&&j<m){
            if(nums1[i]>nums2[j]){
                li.add(nums2[j]);
                j++;
            }
            else {
                li.add(nums1[i]);
                i++;
            }
        }
        while(i<n)li.add(nums1[i++]);
        while(j<m)li.add(nums2[j++]);
        return li.size()%2!=0?(double)li.get(li.size()/2):(double)((li.get(li.size()/2)+li.get((li.size()-1)/2))/2.0);
    }
}