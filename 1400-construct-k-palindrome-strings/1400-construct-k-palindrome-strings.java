class Solution {
    public boolean canConstruct(String s, int k) {
        if(k>s.length())return false;
        Map<Character,Integer> mp=new HashMap<>();
        for(char ch:s.toCharArray())
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        int cnt=0;
        for(int val:mp.values()){
            if(val%2!=0)cnt++;
        }
        return cnt>k?false:true;
    }
}