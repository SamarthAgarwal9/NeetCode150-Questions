//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] input = new String[2]; 
            input = br.readLine().split(" "); 
            int n = Integer.parseInt(input[0]); 
            int m = Integer.parseInt(input[1]); 
            Solution ob = new Solution();
            System.out.println(ob.baseEquiv(n,m));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    String baseEquiv(int n, int m){
        for(int i=2;i<=32;i++){
            int count=0;
            int temp=n;
            for(int j=0;j<m;j++){
                if(temp==0)break;
                temp/=i;
                count++;
            }
            if(temp==0&&count==m)return "Yes";
        }
        return "No";
    }
}