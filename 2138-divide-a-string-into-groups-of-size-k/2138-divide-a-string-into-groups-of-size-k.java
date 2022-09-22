class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=s.length();
        int rem=n%k;
        int r=k-rem;
        int arrsize=(rem==0)?n/k:(n/k)+1;
        String[] res=new String[arrsize];
        int j=0;
        StringBuilder ss=new StringBuilder(s);
        if(rem>0)
        while(r>0){    
            ss.append(fill);
            r--;
        }
        for(int i=0;i<ss.length();i+=k)
            res[j++]=ss.substring(i,i+k);
        return res;
    }
}