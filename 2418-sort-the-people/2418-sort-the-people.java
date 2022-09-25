import static java.util.Collections.reverseOrder;
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> mp=new TreeMap<Integer,String>(Collections.reverseOrder());
        int n=heights.length;
        for(int i=0;i<n;i++)
            mp.put(heights[i],names[i]);
        // Collections.reverseOrder(mp);
        String[] res=new String[n];
        int j=0;
        for(String s:mp.values())
            res[j++]=s;
        return res;
    }
}