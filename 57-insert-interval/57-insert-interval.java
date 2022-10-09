class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n=intervals.length;
        int[][] arr=new int[n+1][2];
        arr[0][0]=newInterval[0];
        arr[0][1]=newInterval[1];
        int k=1;
        for(int[] i: intervals){
            arr[k][0]=i[0];
            arr[k][1]=i[1];
            k++;
        }
         Arrays.sort(arr,(a,b)->a[0]-b[0]);
        List<int[]> res=new ArrayList<>();
        for(int[] i:arr){
            if(res.size()==0||res.get(res.size()-1)[1]<i[0])
                res.add(i);
            else 
                res.get(res.size()-1)[1]=Math.max (res.get(res.size()-1)[1],i[1]);
        }
        return res.toArray(new int[res.size()][]);
    }
}