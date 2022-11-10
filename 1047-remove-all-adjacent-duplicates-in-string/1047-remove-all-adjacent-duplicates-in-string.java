class Solution {
    public String removeDuplicates(String s) {
        int len=s.length();
        StringBuilder sb=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<len;i++){
            char c1=s.charAt(i);
            if(st.isEmpty()||st.peek()!=c1)st.push(c1);
            else st.pop();
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}