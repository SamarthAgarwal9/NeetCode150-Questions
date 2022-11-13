class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int res=logs[0][0],max=logs[0][1];
        for(int i=1;i<logs.length;i++){
            int temp=logs[i][1]-logs[i-1][1];
            if(temp>max){
                max=temp;
                res=logs[i][0];
            }
            else if(temp==max)res=Math.min(res,logs[i][0]);
        }
        return res;
    }
}