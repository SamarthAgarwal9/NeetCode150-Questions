class Solution {
    public int maximumScore(int[] nums, int[] multipliers) {
        int n=nums.length,m=multipliers.length;
        int[][] arr =new int[m+1][m+1];
        for(int i=m-1;i>=0;i--){
            for(int j=i;j>=0;j--){
                arr[i][j]=Math.max(multipliers[i]*nums[j]+arr[i+1][j+1],multipliers[i]*nums[n-1-(i-j)]+arr[i+1][j]);
            }
        }
        return arr[0][0];
    }
}