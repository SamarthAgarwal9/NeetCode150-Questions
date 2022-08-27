class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=nums[i];
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        for(int i:arr){
            if(i>0)pos.add(i);
            else neg.add(i);
        }
        int j=0,k=0;
       for(int i=0;i<n;){
           arr[i++]=pos.get(j++);
           arr[i++]=neg.get(k++);
       }
        return arr;
    }
}