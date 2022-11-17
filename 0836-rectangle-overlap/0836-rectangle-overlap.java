class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int startx1=Math.max(rec1[0],rec2[0]);
        int endx1=Math.min(rec1[2],rec2[2]);
        int xover=endx1-startx1;
    
          int startx2=Math.max(rec1[1],rec2[1]);
        int endx2=Math.min(rec1[3],rec2[3]);
        int yover=endx2-startx2;
    
        int res=(rec1[2]-rec1[0])*(rec1[3]-rec1[1])+(rec2[2]-rec2[0])*(rec2[3]-rec2[1]);
        if(xover>0&&yover>0)return true;
        return false;
    }
    
}