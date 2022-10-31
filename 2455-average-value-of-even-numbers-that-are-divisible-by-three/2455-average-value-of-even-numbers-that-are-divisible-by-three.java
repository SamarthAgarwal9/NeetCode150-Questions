class Solution {
    public int averageValue(int[] nums) {
        int sum=0,c=0;
        for(int i:nums){
            if(i%3==0&&i%2==0){
                sum+=i;
                c++;
            }
        }
        return c>0?sum/c:0;
    }
}