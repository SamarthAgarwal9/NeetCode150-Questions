class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int startx1=Math.max(ax1,bx1);
        int endx1=Math.min(ax2,bx2);
        int xover=(endx1-startx1);
        int startx2=Math.max(ay1,by1);
        int endx2=Math.min(ay2,by2);
        int yover=(endx2-startx2);
        int ar1=(ax2-ax1)*(ay2-ay1);
        int ar2=(bx2-bx1)*(by2-by1);
        int res=ar1 + ar2;
        if(xover>0 && yover>0)return res-xover*yover;
        return res;
    }
}