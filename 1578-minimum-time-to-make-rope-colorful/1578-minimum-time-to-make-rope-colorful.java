class Solution {
    public int minCost(String colors, int[] neededTime) {
        int res=0;
        int n=colors.length();
        for(int i=1;i<n;i++){
            if(colors.charAt(i)==colors.charAt(i-1)){
                res+=Math.min(neededTime[i],neededTime[i-1]);
                if(neededTime[i]<neededTime[i-1])neededTime[i]=neededTime[i-1];
            }
        }
        return res;
    }
}