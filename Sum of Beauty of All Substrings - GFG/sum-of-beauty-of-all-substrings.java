//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            //br.readLine();
            String s;
            s = br.readLine();
            
            Solution obj = new Solution();
            int res = obj.beautySum(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int beautySum(String s) {
        int n =s.length();
        int res=0;
        for(int i=0;i<n;i++){
            int[] fr=new int[26];
            for(int j=i;j<n;j++){
                int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
                fr[s.charAt(j)-'a']++;
                for(int k=0;k<26;k++){
                    if(fr[k]!=0){
                        min=Math.min(min,fr[k]);
                        max=Math.max(max,fr[k]);
                    }
                }
                res+=max-min;
            }
        }
        return res;
    }
}
        
