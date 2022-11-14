//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            String W = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.numberOfSubsequences(S,W));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int numberOfSubsequences(String S, String W){
        int slen=S.length(),wlen=W.length();
        int res=0;
        boolean[] vis=new boolean[slen];
        for(int i=0;i<slen;i++){
            if(S.charAt(i)==W.charAt(0)&&!vis[i]){
                vis[i]=true;
                int j=i+1;
                int k=1;
                while(j<slen&&k<wlen){
                    if(S.charAt(j)==W.charAt(k)&&!vis[j]){
                    vis[j]=true;
                    k++;
                    }
                j++;
                 }
            if(k==wlen)res++;
            else break;
        }
        }
        return res;
    }
}