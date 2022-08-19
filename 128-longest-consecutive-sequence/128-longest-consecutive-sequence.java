class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n<2)return n;
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for(int i:nums)pq.add(i);
        System.out.println(pq);
        int res=1,max=1;
        int prev=pq.poll();
        while(pq.size()!=0){
            if(prev==pq.peek()){pq.poll();continue;}
            if(prev+1==pq.peek()){
                prev=pq.poll();
                res++;
                max=Math.max(res,max);
            }
            else {prev=pq.poll();
            res=1;
                }
        }
        return Math.max(res,max);
    }
}