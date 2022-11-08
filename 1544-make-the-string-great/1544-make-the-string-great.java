class Solution {
    public String makeGood(String s) {
        StringBuilder str=new StringBuilder(s);
        while(str.length()>1){
            boolean fl=false;
        for(int i=0;i<str.length()-1;i++){
            char c1=str.charAt(i),c2=str.charAt(i+1);
            if(Math.abs(c1-c2)==32){
                str.deleteCharAt(i);
                str.deleteCharAt(i);
                fl=true;
                break;
            }
        }
        if(!fl)break;
        }
        return str.toString();
    }
}