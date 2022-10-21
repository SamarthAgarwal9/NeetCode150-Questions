//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] input = new String[2]; 
            input = read.readLine().split(" "); 
            int R = Integer.parseInt(input[0]); 
            int C = Integer.parseInt(input[1]); 
            String s1[] = read.readLine().trim().split("\\s+");
            int a[][] = new int[R][C];
            for(int i = 0;i < R*C;i++)
                a[i/C][i%C] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int[] ans = ob.reverseSpiral(R,C,a);
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
    public int[] reverseSpiral(int R, int C, int[][] a){
        ArrayList<Integer> res=new ArrayList<>();
        int rs=0,re=R-1,cs=0,ce=C-1;
        while(rs<=re && cs<=ce){
            for(int j=cs;j<=ce;j++)
                res.add(a[rs][j]);
            rs++;
            for(int i=rs;i<=re;i++)
                res.add(a[i][ce]);
            ce--;
            if(rs<=re){
                for(int j=ce;j>=cs;j--)
                    res.add(a[re][j]);
                re--;
            }
            if(cs<=ce){
                for(int i=re;i>=rs;i--)
                    res.add(a[i][cs]);
                cs++;
            }
        }
        int i=0;
        int j=res.size()-1;
        int[] ans=new int[j+1];
        while(j>=0){
            ans[i]=res.get(j);
            i++;
            j--;
        }
        return ans;
    }
}