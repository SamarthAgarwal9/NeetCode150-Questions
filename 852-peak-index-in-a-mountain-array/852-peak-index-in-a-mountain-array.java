class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int res=-1;
        for(int i=1;i<n;i++){
            if(arr[i-1]<arr[i])res=i;
            else return res;
        }
        return res;
    }
}