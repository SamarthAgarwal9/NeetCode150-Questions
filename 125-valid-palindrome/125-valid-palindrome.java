class Solution {
    public boolean isPalindrome(String s) {
         s=s.replaceAll("[^a-zA-Z0-9]", "");
         s=s.toLowerCase();
        return isPalindrome2(s)?true:false;
    }
    public boolean isPalindrome2(String s){
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    } 
}