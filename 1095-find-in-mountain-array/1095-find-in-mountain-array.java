/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n=mountainArr.length();
        int peak=0;
         int left  = 0;
        int right = n - 1;
        while (left < right) {
           int m = (left + right) / 2;
            if (mountainArr.get(m) < mountainArr.get(m + 1))
                left = peak = m + 1;
            else
                right = m;
        }
        left=0;right=peak;
        while(left<=right){
            int mid=(left+right) /2;
            if(mountainArr.get(mid)==target)return mid;
            else if(mountainArr.get(mid)>target)right=mid-1;
            else left=mid+1;
        }
        left=peak;right=n-1;
        while(left<=right){
            int mid=(left+right) /2;
            if(mountainArr.get(mid)==target)return mid;
            else if(mountainArr.get(mid)<target)right=mid-1;
            else left=mid+1;
        }
        return -1;
    }
}