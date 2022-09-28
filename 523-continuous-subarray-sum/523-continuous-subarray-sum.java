class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        if(n==1)return false;
        if(n==2)return (nums[1]+nums[0])%k==0?true:false;
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,0);
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(!mp.containsKey(sum%k))
            mp.put(sum%k,i+1);
            else if(mp.get(sum%k)<i)return true;
        }
        return false;
    }
}