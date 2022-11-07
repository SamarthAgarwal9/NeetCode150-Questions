class Solution {
    public int countLatticePoints(int[][] circles) {
        HashSet<String> res=new HashSet<>();
        HashSet<String> str=new HashSet<>();
        for(int[] cir:circles){
            int x=cir[0],y=cir[1],r=cir[2];
            if(str.contains(x+","+y+","+r))continue;
            str.add(x+","+y+","+r);
            for(int i=x-r;i<=x+r;i++)
                for(int j=y-r;j<=y+r;j++)
                    if((x-i)*(x-i)+(y-j)*(y-j)<=r*r)res.add(i+","+j);
        }
        return res.size();
    }
}