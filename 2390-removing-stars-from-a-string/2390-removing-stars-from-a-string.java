class Solution {
    public String removeStars(String s) {
        int n=s.length();
        StringBuilder str=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(!st.isEmpty()&&st.peek()!='*'&&s.charAt(i)=='*')st.pop();
            else st.push(s.charAt(i));
        }
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        str.reverse();
        return str.toString();
    }
}