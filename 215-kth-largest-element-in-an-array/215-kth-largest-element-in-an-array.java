class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:nums)pq.offer(i);
        while(pq.size()-k>=1)pq.poll();
        return pq.size()>0?pq.peek():0;
    }
}