class Solution {
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int maxi=0;
        int[] dir=new int[]{-1,1};
        for(int i:dir){
            for(int j:dir){
                int small=i*arr1[0]+j*arr2[0];
                for(int k=1;k<arr1.length;k++){
                    int curr=i*arr1[k]+j*arr2[k]+k;
                    maxi=Math.max(maxi,curr-small);
                    small=Math.min(curr,small);
                }
            }
        }
        return maxi;
    }
}