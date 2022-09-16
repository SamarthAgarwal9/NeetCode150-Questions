class Solution {
    public int mostFrequentEven(int[] nums) {
       Map<Integer ,Integer> mp=new TreeMap<>();
        for(int i:nums){
            if(i%2==0){
                mp.put(i,mp.getOrDefault(i,0)+1);
            }
        }
        int res=0,max=-1;
        for(int i:mp.keySet()){
            if(mp.get(i)>res){
            res=Math.max(res,mp.get(i));
            max=i;
            }
        }
        return max;
    }
}