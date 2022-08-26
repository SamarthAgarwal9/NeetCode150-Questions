class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int row=mat.length,col=mat[0].length;
        if(row==1||col==1)return mat;
        for(int i=row-2;i>=0;i--){
            List<Integer> li=new ArrayList();
            int ii=i,jj=0;
            while(ii<row&&jj<col){
                li.add(mat[ii][jj]);
                ii++;
                jj++;
            }
            Collections.sort(li);
            ii=i;
            jj=0;
            int k=0;
            while(ii<row&&jj<col){
                mat[ii][jj]=li.get(k++);
                ii++;
                jj++;
            }
        }
        for(int i=1;i<col;i++){
            List<Integer> li=new ArrayList();
            int ii=0,jj=i;
            while(ii<row&&jj<col){
                li.add(mat[ii][jj]);
                ii++;
                jj++;
            }
            Collections.sort(li);
            ii=0;
            jj=i;
            int k=0;
            while(ii<row&&jj<col){
                mat[ii][jj]=li.get(k++);
                ii++;
                jj++;
            }
        }
        return mat;
    }
}