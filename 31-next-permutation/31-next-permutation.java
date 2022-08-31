class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length,i=n-2;
        while(i>=0 && nums[i]>=nums[i+1])i--;
        if(i>=0){
               int j=n-1;
            while(nums[i]>=nums[j])j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
    }
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    void reverse(int[] nums,int i,int j){
        while(i<j){
        swap(nums,i,j);
        i++;j--;
        }
    }
}