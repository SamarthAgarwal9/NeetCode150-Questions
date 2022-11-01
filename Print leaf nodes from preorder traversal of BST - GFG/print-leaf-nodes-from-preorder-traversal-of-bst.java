//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(read.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            Solution ob = new Solution();
            int[] ans = ob.leafNodes(arr, N);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[] leafNodes(int arr[], int N)
    {
        // code here
        List<Integer> li=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        st.add(arr[0]);
        for(int i=1;i<N;i++){
            if(st.peek()>arr[i])st.add(arr[i]);
            else{
                int temp=st.peek();
                int len=st.size();
                while(st.isEmpty()==false && st.peek()<arr[i])st.pop();
                st.add(arr[i]);
                if(len>st.size())li.add(temp);
            }
        }
        li.add(st.peek());
        int[] res=new int[li.size()];
        int s=0;
        for(int i:li)
        res[s++]=i;
        return res;
    }
}