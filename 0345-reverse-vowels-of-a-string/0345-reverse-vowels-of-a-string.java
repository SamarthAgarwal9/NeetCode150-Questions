class Solution {
     public boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')return true;
        return false;
    }
    public String reverseVowels(String s) {
        int n=s.length();
        int start=0,end=n-1;
        StringBuilder str=new StringBuilder(s);
        while(start<end){
            char ch=str.charAt(start);
            char ch2=str.charAt(end);
            if(isVowel(ch))
            {
                if(isVowel(ch2)){
                    //swap
                    str.setCharAt(start,ch2);
                    str.setCharAt(end,ch);
                    start++;end--;                }
                else {end--;continue;}
            }
            else{
                start++;
            }
        }
        return str.toString();
    }
}