class Solution {
public int maxConsecutive(int bottom, int top, int[] special) {
    int n=special.length;
    if(n==0)return top-bottom+1;
    Arrays.sort(special);
    int res=0,max=0;
    for(int i:special){
        res=i-bottom;
        bottom=i+1;
        max=Math.max(max,res);
    }
    if(bottom<top){
        res=top-bottom+1;
        max=Math.max(res,max);
    }
    return max;
    }
}