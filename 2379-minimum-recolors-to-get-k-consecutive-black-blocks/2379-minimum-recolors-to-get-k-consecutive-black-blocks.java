class Solution {
    public int minimumRecolors(String blocks, int k) {
        int res=0;
        int n =blocks.length();
        for(int i=0;i<k;i++)
            if(blocks.charAt(i)=='W')res++;
        int min=res;
        for(int i=k;i<n;i++){
            if(blocks.charAt(i-k)=='W')res--;
            if(blocks.charAt(i)=='W')res++;
            min=Math.min(res,min);
        }
        return min;
    }
}