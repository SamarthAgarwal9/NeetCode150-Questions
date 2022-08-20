class Solution {
    public boolean check(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public int maxVowels(String s, int k) {
        int max=0,res=0,n=s.length();
        for(int i=0;i<n;i++){
            if(check(s.charAt(i)))res++;
            if(i>=k&&check(s.charAt(i-k)))res--;
            max=Math.max(res,max);
        }
        return max;
    }
}