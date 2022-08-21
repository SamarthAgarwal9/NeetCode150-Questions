class Solution {
    public int divisorSubstrings(int num, int k) {
        String str=Integer.toString(num);
        int res=0;
        for(int i=0;i<=str.length()-k;i++){
            int temp=Integer.valueOf(str.substring(i,i+k));
            //System.out.println(temp);
            if(temp==0)continue;
            if(num%temp==0)res++;
        }
        return res;
    }
}