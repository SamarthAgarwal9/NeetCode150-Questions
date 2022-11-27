class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> res=new LinkedList<String>();
        int n=digits.length();
        if(n==0)return res;
        String[] map=new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        res.add("");
        while(res.peek().length()!=digits.length()){
            String rmv=res.remove();
            String mp=map[digits.charAt(rmv.length())-'0'];
            for(char ch:mp.toCharArray()){
                res.addLast(rmv+ch);
            }
        }
        return res;
    }
}