class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0,co=num;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                sum+=i;
            if(i*i!=num)
                sum+=num/i;
            }
        }
        return sum==num*2?true:false;
    }
}