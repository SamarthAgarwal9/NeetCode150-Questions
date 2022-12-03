class Solution {
    public String frequencySort(String s) {
        char[] ch=s.toCharArray();
        Map<Character,Integer> mp=new HashMap<>();
        for(char n:s.toCharArray()) mp.put(n,mp.getOrDefault(n,0)+1);
        List<Character> li = new ArrayList(mp.keySet());
	    Collections.sort(li, (a, b) -> (mp.get(b) - mp.get(a)));
        StringBuilder sb = new StringBuilder();
        for(char ch11:li)
            for(int i = 0; i < mp.get(ch11); i++)sb.append(ch11);
        return sb.toString();
    }
}