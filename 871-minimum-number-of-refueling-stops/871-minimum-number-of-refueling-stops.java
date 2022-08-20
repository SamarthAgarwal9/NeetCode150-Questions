class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        if(startFuel>=target)return 0;
        int n=stations.length;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
        int i=0,refill=0,dist=startFuel;
        while(dist<target){
            while(i<n && dist>=stations[i][0]){
                pq.offer(stations[i]);
                i++;
            }
            if(pq.isEmpty())return -1;
            dist+=pq.remove()[1];
            refill++;
        }
        return refill;
    }
}