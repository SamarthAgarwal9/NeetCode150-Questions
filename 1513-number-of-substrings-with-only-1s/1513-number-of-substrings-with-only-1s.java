class Solution {
    public int numSub(String s) {
        int res=0;
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1')count++;
            else count=0;
            res=(res+count)%1000000007;
        }
        return res;
    }
}