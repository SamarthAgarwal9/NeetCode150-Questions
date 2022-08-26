class Solution {
    public boolean checkPerfectNumber(int num) {
        int[] prime =new int[]{2,3,5,7,13,17,19,31};
        for(int p:prime){
            int val=((1<<(p-1))*((1<<p)-1));
            if(val==num)return true;
        }
        return false;
    }
}