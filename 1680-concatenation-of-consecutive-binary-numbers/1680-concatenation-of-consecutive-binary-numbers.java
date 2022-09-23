class Solution {
    public int concatenatedBinary(int n) {
        int mod=1000000007;
        long sum=0;
        for(int i=1;i<=n;i++){
            sum=(sum*(int)Math.pow(2,Integer.toBinaryString(i).length())+i)%mod;
        }
        
        return (int)sum;
    }
}