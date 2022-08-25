class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder str=new StringBuilder(s);
        int br=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')br++;
            else if(s.charAt(i)==')'){
                if(br>0)br--;
                else str.replace(i,i+1," ");
            }
        }
        if(br>0){
            for(int i=str.length()-1;i>=0;i--){
                if(br==0)break;
                if(str.charAt(i)=='(' && br>0){
                    br--;
                    str.replace(i,i+1," ");
                }
            }
        }  
       String str1=str.toString();
        str1=str1.replaceAll(" ","");
        return str1;
    }
}