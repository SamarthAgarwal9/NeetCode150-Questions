class Solution {
    public int sumSubarrayMins(int[] arr) {
        long res=0;
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        for(int i=0;i<n+1;i++){
            int curr=i<n?arr[i]:0;
            while(st.peek()!=-1 && curr<arr[st.peek()]){
                int ind=st.pop();
                int i1=st.peek();
                int end=i-ind;
                int start=ind-i1;
                long l1=(long)(end*start*(long)arr[ind])%1000000007;
                res+=l1;
                res%=1000000007;
            }
            st.push(i);
        }
        return (int)res;
    }
            
}