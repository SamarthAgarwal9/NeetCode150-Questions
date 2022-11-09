class Solution {
    public int minimumDeletions(String s) {
       int res=0;
        Deque<Character> dq=new ArrayDeque<>();
        for(char c:s.toCharArray()){
            if(!dq.isEmpty()  && dq.peek()=='b' && c=='a'){
                dq.pop();
                ++res;
            }
            else dq.push(c);
        }
        return res;
    }
     
}