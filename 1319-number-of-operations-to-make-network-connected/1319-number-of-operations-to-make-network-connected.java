class Solution {
    public int makeConnected(int n, int[][] connections) {
        int row=connections.length;
        if(row<n-1)return -1;
        Map<Integer,List<Integer>> mp=new HashMap<>();
        HashSet<Integer> hs=new HashSet<>();
        //list making 
        for(int[] i:connections){
            if(!mp.containsKey(i[0]))
            mp.put(i[0],new ArrayList<>());
            mp.get(i[0]).add(i[1]);
            if(!mp.containsKey(i[1]))
            mp.put(i[1],new ArrayList<>());
            mp.get(i[1]).add(i[0]);
        }
        int compo=0;
       // traverse the running status 
        for(int i=0;i<n;i++)
            if(!hs.contains(i)){
                dfs(hs,mp,i);
                compo++;
            }
        return compo-1;
    }
    void dfs(HashSet<Integer> hs,Map<Integer,List<Integer>> mp,int ind){
        if(hs.contains(ind))return ; 
        hs.add(ind);
        for(int next:mp.getOrDefault(ind,new ArrayList<>()))
            dfs(hs,mp,next);
    }
}