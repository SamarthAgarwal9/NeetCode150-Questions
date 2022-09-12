class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int row=image.length;
        int col=image[0].length;
        int color=image[sr][sc];
        if(color!=newColor)dfs(image,sr,sc,color,newColor);
        return image;
    }
    void dfs(int[][] image,int r,int c,int color,int ncolor){
        if(image[r][c]==color){
            image[r][c]=ncolor;
            if(r>=1)dfs(image,r-1,c,color,ncolor);
            if(c>=1)dfs(image,r,c-1,color,ncolor);
            if(r<image.length-1)dfs(image,r+1,c,color,ncolor);
            if(c<image[0].length-1)dfs(image,r,c+1,color,ncolor);
        }
    }
}