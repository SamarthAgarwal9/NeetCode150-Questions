class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" ");
        StringBuilder res=new StringBuilder();
        int n=str.length-1,i=0;
        for(String ss:str){
            StringBuilder temp=new StringBuilder(ss);
            temp.reverse();
            res.append(temp);
            if(i!=n)res.append(" ");
            i++;
        }
        return res.toString();
    }
}