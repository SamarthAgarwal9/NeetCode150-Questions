class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> res=new ArrayList<>();
        solve(res,0,0,n,"");
        return res;
    }
    void solve(ArrayList<String> res,int s,int e,int n,String str){
        if(e>s)return;
        if(str.length()==n*2){
            res.add(str);
            return;
        }
         
        if(s<n)solve(res,s+1,e,n,str+"(");
        if(n>e)solve(res,s,e+1,n,str+")");

    }
}