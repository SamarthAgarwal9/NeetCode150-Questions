//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            ArrayList<Integer> ans = new Solution().findSubarray(a, n);
            for(int i:ans){
                out.print(i+" ");
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    ArrayList<Integer> findSubarray(int a[], int n) {
        // code here
        ArrayList<Integer> li=new ArrayList<>();
         ArrayList<Integer> res=new ArrayList<>();
         int s1=0,s2=0;
         for(int i:a){
             if(i>=0){li.add(i);s2+=i;}
             else{
                 if(s1<s2){
                     res.clear();
                     res.addAll(li);
                     s1=s2;
                 }
                 s2=0;
                 li.clear();
             }
         }
         if(s2>s1){
             res.clear();
             res.addAll(li);
         }
         if(res.size()>0)return res;
         res.add(-1);
         return res;
    }
}