class KthLargest {
    PriorityQueue<Integer> pq;
    int ind=0;
    public KthLargest(int k, int[] nums){
        pq=new PriorityQueue();
        ind=k;
        for(int i:nums)pq.offer(i);
        while(pq.size()>k)pq.poll();
    }
    
    public int add(int val) {
        pq.offer(val);
        if(pq.size()>ind)pq.poll();      
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */