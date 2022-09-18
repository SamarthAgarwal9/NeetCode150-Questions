class Solution {
    public int longestContinuousSubstring(String s) {
        int n=s.length();
        int max=1,count=1;
        for(int i=1;i<n;i++){
            if((s.charAt(i-1)+1)==s.charAt(i)){
                count++;
                max=Math.max(max,count);
            }
            else count=1;
        }
        return max;
    }
}