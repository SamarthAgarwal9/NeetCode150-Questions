class Solution {
    public boolean checkPowersOfThree(int n) {
        List<Integer> l=new ArrayList<>();
        while(n>0){
        int check=(int)(Math.floor((Math.log10(n)/Math.log10(3))));
            n-=(int)Math.pow(3,check);
            l.add(check);
            //System.out.println(check +"  "+n);
            //if(n==2)return false;
        }
        Set<Integer> ss=new HashSet<>(l);
        
        return n==0?ss.size()==l.size():false;
    }
}