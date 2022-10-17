class Solution {
    public int countPrimes(int n) {
        if(n==0||n==1)return 0;
        int res=0;
        boolean[] vis=new boolean[n];
        for(int i=2;i<n;i++){
            if(vis[i]==false){
                res++;
                for(int j=2;i*j<n;j++){
                    vis[j*i]=true;
                }
            }
            
        }
    
        return res;
    
    }
}