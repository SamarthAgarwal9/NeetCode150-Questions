class Solution {
    public boolean checkDistances(String s, int[] distance) {
       HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!mp.containsKey(s.charAt(i)))
                mp.put(s.charAt(i),i);
            else{
                if(distance[s.charAt(i)-'a']+1!=i-mp.get(s.charAt(i)))
                    return false;
            }
        }
        return true;
    }
}