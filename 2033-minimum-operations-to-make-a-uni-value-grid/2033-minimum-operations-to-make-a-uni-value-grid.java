class Solution {
    public int minOperations(int[][] grid, int x) {
        if(!check(grid,x))return -1;
          int n=grid.length;
            int c=grid[0].length;
            List<Integer> li=new ArrayList<>();
             for(int[] i:grid)
                for(int j:i)
                    li.add(j);
        Collections.sort(li);
        int res=0;
        if(li.size()%2==0){
        int median1=li.get(li.size()/2);
        int median2=li.get((li.size()/2) -1);
            int res1=0,res2=0;
            for(int i:li)
                res1+=Math.abs(i-median1)/x;
            for(int i:li) 
                res2+=Math.abs(i-median2)/x;
            res=Math.min(res1,res2);
        }
        else{
            int median=li.get(li.size()/2);
            for(int i:li)
                res+=Math.abs(i-median)/x;
        }
        return res;
    }
    public boolean check(int[][] grid,int x){
        int n=grid.length;
        int c=grid[0].length;
        int mod=grid[0][0]%x;
        for(int[] i:grid)
            for(int j:i)
                if(j%x!=mod)return false;
        return  true;
    }
}