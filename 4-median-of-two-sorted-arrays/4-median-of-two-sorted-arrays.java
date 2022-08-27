class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
       int i=0,j=0,m1=0,m2=0;
        for(int ind=0;ind<=(n+m)/2;ind++){
            m1=m2;
            if(i==n){
                m2=nums2[j];
                j++;
            }
            else if(j==m){
                m2=nums1[i];
                i++;
            }
            else if(nums1[i]>nums2[j]){
                m2=nums2[j];
                j++;
            }
            else if(nums1[i]<=nums2[j]){
                m2=nums1[i];
                i++;
            }
        }
        if((n+m )%2==0)return (double)(m1+m2)/2;
        return m2;
    }
}