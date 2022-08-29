class Solution {
    int size=0;
    public long countPairs(int n, int[][] edges) {
        List<List<Integer>> li=buildLink(n,edges);
        List<Integer> sizeList=new ArrayList<>();
        boolean[] visit=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visit[i]){
               size=1;
                graph(i,visit,li);
                sizeList.add(size);
            }
        }
        long res=0,sum=n;
        for(int i=0;i<sizeList.size();i++){
            sum-= sizeList.get(i);
            res+=sum*sizeList.get(i);
        }
         return res;
    }
    void graph(int i,boolean[] visit,List<List<Integer>> li){
        visit[i]=true;
        for(int ind:li.get(i)){
            if(!visit[ind]){
                size++;
                graph(ind,visit,li);
            }
        }
    }
    public List<List<Integer>> buildLink(int n,int[][] edges){
        List<List<Integer>> lis=new ArrayList<>();
        for(int i=0;i<n;i++)
            lis.add(new ArrayList<>());
        for(int[] ed:edges){
            lis.get(ed[0]).add(ed[1]);
            lis.get(ed[1]).add(ed[0]);
        }
        return lis;
    }
    
}