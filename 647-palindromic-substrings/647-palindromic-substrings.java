class Solution {
    int count=0;
    public int countSubstrings(String s) {
            int n=s.length();
        if(n==0 || s==null) return 0;
        for(int i=0,j=0;i<n;i++){
                check(s,i,i);
            check(s,i,i+1);
        }
        return count;
    }
    void check(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            count++;
            left--;
            right++;
        }
     }
}