class Solution {
    public boolean isPowerOfFour(int n) {
        double rem=Math.log(n)/Math.log(4);
        return rem%1==0.0?true:false;
    }
}