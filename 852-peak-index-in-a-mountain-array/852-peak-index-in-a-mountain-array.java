class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i-1]<arr[i])continue;
            else return i-1;
        }
        return -1;
    }
}