//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String str = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.buildLowestNumber(str,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String buildLowestNumber(String str, int N) {
        StringBuilder res=new StringBuilder();
        Stack<Character> st=new Stack<>();
         for(char ch:str.toCharArray()){
             while(!st.isEmpty() && st.peek()>ch && N-->0)st.pop();
             st.push(ch);
         }
         while(!st.isEmpty()){
            char ch=st.pop();
            if(N-->0)continue;
             res.append(Character.toString(ch));
         }
        
        String sb=res.reverse().toString();
        for(int i=0;i<sb.length();i++)
        if(sb.charAt(i)!='0') return sb.substring(i);
        return "0";
       
        
        
    }
}