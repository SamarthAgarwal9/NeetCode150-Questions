class Solution {
    public boolean isPathCrossing(String path) {
        if(path.length()<=1)return false;
        int i=0,j=0;
        Set<String> seen = new HashSet<>();
        seen.add(0 + ", " + 0);
        for(int ind=0;ind<path.length();ind++){
            if(path.charAt(ind)=='E')i++;
            else if(path.charAt(ind)=='W')i--;
            else if(path.charAt(ind)=='S')j--;
            else if(path.charAt(ind)=='N')j++;
            if(!seen.add(i+", "+j))return true;
        }
        return false;
    }
}