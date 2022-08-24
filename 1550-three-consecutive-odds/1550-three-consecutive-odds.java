class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count=0;
        for(int i:arr){
            if(count==3)return true;
            if(i%2!=0)count++;
            else count=0;
        }
        return count==3;
    }
}