class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> res=new ArrayList<>();
        int n=matches.length;
        Map<Integer,Integer> mp1=new HashMap<>();
        Map<Integer,Integer> mp2=new HashMap<>();
        for(int[] i:matches){
            mp1.put(i[0],mp1.getOrDefault(i[0],0)+1);
            mp2.put(i[1],mp2.getOrDefault(i[1],0)+1);
        }
        List<Integer> li=new ArrayList<>();
        for(int i:mp1.keySet()){
            if(!mp2.containsKey(i))li.add(i);
        }
        Collections.sort(li);
        res.add(li);
        List<Integer> li2=new ArrayList<>();
        for(int i:mp2.keySet()){
            if(mp2.get(i)==1)li2.add(i);
        }
        Collections.sort(li2);
        res.add(li2);
        return res;
    }
}