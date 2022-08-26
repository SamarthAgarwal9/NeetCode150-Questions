class Solution {
    public boolean reorderedPowerOf2(int n) {
        char[] ch=String.valueOf(n).toCharArray();
        Arrays.sort(ch);
        String sort1=new String(ch);
        for(int i=0;i<31;i++){
            char[] ch2=String.valueOf(1<<i).toCharArray();
            Arrays.sort(ch2);
            String sort2=new String(ch2);
            if(sort1.equals(sort2))return true;
        }
        
        return false;
    }
}