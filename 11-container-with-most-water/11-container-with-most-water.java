class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int max=Integer.MIN_VALUE,curr=0;
        while(i<j){
            curr=(j-i)*(Math.min(height[i],height[j]));
            max=Math.max(max,curr);
              if(height[i]<height[j])i++;
            else j--;
        }
        return max;
    }
}