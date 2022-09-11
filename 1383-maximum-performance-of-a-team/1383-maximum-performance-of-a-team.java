class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=efficiency[i];
            arr[i][1]=speed[i];
        }
        Arrays.sort(arr,(a,b)->(b[0]-a[0]));
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        long res=0,sum=0;
        for(int[] i :arr){
            pq.add(i[1]);
            sum+=i[1];
            if(pq.size()>k)sum-=pq.poll();
            res=Math.max(res,sum*i[0]);
        }
        return (int)(res%(long)(1000000007));
    }
}