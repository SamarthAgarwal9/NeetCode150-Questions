class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        if(s1==null)return true;
        // int i=-1;
        // for(int ind=0;ind<s2.length();ind++){
        //     if(s1.charAt(0)==s2.charAt(ind)){
        //         i=ind;
        //         break;
        //     }
        // }
        // if(i==-1)return false;
        s1=sort(s1);
        for(int i=0;i<=s2.length()-s1.length();i++){
            if(s1.equals(sort(s2.substring(i,i+s1.length()))))
                return true;
        }
        
        return false;
    }
    String sort(String s){
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}