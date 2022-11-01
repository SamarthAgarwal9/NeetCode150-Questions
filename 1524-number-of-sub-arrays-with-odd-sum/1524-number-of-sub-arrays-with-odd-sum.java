class Solution {
    public int numOfSubarrays(int[] arr) {
       long ans=0,even=0,odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)even++;
            else{
                long temp=odd;
                odd=even;
                even=temp;
                odd++;
            }
            ans+=odd;
        }
        return (int)(ans% 1000000007);
    }
}