class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int s1=ransomNote.length(),s2=magazine.length();
        if(s1>s2)return false;
        if(magazine.contains(ransomNote))return true;
        Map<Character,Integer> m1=new HashMap<>();
        Map<Character,Integer> m2=new HashMap<>();
        for(char c:ransomNote.toCharArray())
            m1.put(c,m1.getOrDefault(c,0)+1);
        for(char c:magazine.toCharArray())
            m2.put(c,m2.getOrDefault(c,0)+1);
        for(char c:m1.keySet()){
            if(m2.containsKey(c))
                if(m2.get(c)<m1.get(c))
                    return false;
                else continue;
            else return false;
        }
        return true;
    }
}