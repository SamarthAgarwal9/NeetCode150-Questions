class Solution {
    public boolean checkIfPangram(String sentence) {
        int n=sentence.length();
        if(n<26)return false;
        Set<Integer> mp=new HashSet<>();      
        for(char ch:sentence.toCharArray())
            mp.add(ch-'a');
        return mp.size()==26?true:false;
    }
}