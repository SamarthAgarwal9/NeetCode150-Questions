//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> numbers= new ArrayList<Integer>();
            numbers = ob.minPartition(N);
            for(int i: numbers){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> minPartition(int N)
    {
        // code here
        List<Integer> res=new ArrayList<>();
        while(N>0){
            if(N>=2000){
                int n=N/2000;
                N=N-2000*n;
                for(int i=0;i<n;i++)res.add(2000);
            }
            else if(N>=500){
                int n=N/500;
                N=N-500*n;
                for(int i=0;i<n;i++)res.add(500);
            }
            else if(N>=200){
                int n=N/200;
                N=N-200*n;
                for(int i=0;i<n;i++)res.add(200);
            }
            else if(N>=100){
                int n=N/100;
                N=N-100*n;
                for(int i=0;i<n;i++)res.add(100);
            }
            else if(N>=50){
                int n=N/50;
                N=N-50*n;
                for(int i=0;i<n;i++)res.add(50);
            }
            else if(N>=20){
                int n=N/20;
                N=N-20*n;
                for(int i=0;i<n;i++)res.add(20);
            }
            else if(N>=10){
                int n=N/10;
                N=N-10*n;
                for(int i=0;i<n;i++)res.add(10);
            }
            else if(N>=5){
                int n=N/5;
                N=N-5*n;
                for(int i=0;i<n;i++)res.add(5);
            }
            else if(N>=2){
                int n=N/2;
                N=N-2*n;
                for(int i=0;i<n;i++)res.add(2);
            }
            else if(N>=1){
                int n=N/1;
                N=N-1*n;
                for(int i=0;i<n;i++)res.add(1);
            }
        }
        return res;
    }
}