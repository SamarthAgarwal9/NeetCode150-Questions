class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        if(n==1)return new int[]{0,1,2,3,4,5,6,7,8,9};
        List<Integer> res=new ArrayList<>();
        for(int num=1;num<10;num++)
            dfs(num,n-1,k,res);
        int[] ans=new int[res.size()];
        int l=0;
        for(int i:res)ans[l++]=i;
        return ans;
    }
    void dfs(int num,int n,int k,List<Integer> res){
        if(n==0){res.add(num);return;}
        List<Integer> next=new ArrayList<>();
        int temp=num%10;
        next.add(temp+k);
        if(k!=0) next.add(temp-k);
        for(Integer nex:next){
            if(0<=nex&&nex<10)
                dfs(num*10+nex,n-1,k,res);
        }
    }
}