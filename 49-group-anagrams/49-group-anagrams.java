class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp=new HashMap<>();
        for(String s1:strs){
            char[] ch=s1.toCharArray();
            Arrays.sort(ch);
            String chs=new String(ch);
            if(mp.containsKey(chs))mp.get(chs).add(s1);
            else{
                mp.put(chs,new ArrayList<>());
                mp.get(chs).add(s1);
            }
        }
        return new ArrayList<>(mp.values());
    }
}