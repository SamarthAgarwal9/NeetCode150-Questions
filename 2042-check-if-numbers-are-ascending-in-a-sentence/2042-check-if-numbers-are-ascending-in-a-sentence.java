class Solution {
    public boolean areNumbersAscending(String s) {
        String[] str=s.split(" ");
        int prev=-1;
        for(String sr:str){
            if(sr.charAt(0)-'0'>=0 && sr.charAt(0)-'0'<=9){
                int cal=Integer.valueOf(sr);
                if(cal<=prev)return false;
                prev=cal;
            }
        }
        return true;
    }
}