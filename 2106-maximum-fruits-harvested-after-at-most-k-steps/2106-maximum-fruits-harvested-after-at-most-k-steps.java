class Solution {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int res=0,n=fruits.length;
        if(n==0)return 0;
        int no=200001;
        int[] psum=new int[no];
        for(int[] i:fruits)
            psum[i[0]]=i[1];
        for(int i=1;i<no;i++)
            psum[i]+=psum[i-1];
        //move to right 
        for(int i=startPos;i<=Math.min(startPos+k,no-1);i++){
            int r=i;
            int x=i-startPos;
            int l=startPos-(k-2*x);
            l=Math.min(l,startPos);
            int sum=psum[r];
            if(l>0)sum-=psum[l-1];
            res=Math.max(res,sum);
        }
        // move to the left
        
        for(int i=startPos;i>=Math.max(0,startPos-k);i--){
            int l=i;
            int x=startPos-i;
            int r=startPos+(k-2*x);
            r=Math.max(Math.min(r,no-1),startPos);
            int sum=psum[r];
            if(l>0) sum-=psum[l-1];
            res=Math.max(res,sum);
        }
        return res;
    }
}