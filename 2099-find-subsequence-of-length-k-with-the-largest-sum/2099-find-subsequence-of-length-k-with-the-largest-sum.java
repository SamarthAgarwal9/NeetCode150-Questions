class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        if(nums.length==k)return nums;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i=0;i<nums.length;i++){
            pq.offer(new int[]{nums[i],i});
            if(pq.size()>k)pq.poll();
        }
        Set<Integer> li=new HashSet();
        while(pq.size()>0)li.add(pq.poll()[1]);
        int[] res=new int[k];
        int l=0;
        for(int i=0;i<nums.length;i++){
            if(li.contains(i)){
                res[l]=nums[i];
                l++;
            }
        }
        return res;
    }
}