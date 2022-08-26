class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        if(n==1)return stones[0];
        PriorityQueue<Integer> pq=new PriorityQueue(Collections.reverseOrder());
        for(int i:stones)pq.offer(i);
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            if(a==b)continue;
            pq.offer(a-b);
        }
        return pq.size()==0?0:pq.poll();
    }
}