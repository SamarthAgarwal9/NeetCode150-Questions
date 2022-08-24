class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        System.out.println(n);
        int ris=(5*n)/100;
        //Set<Integer> s=new HashSet<>();
        double si=0;
        for(int i=ris;i<n-ris;i++){
            si+=(arr[i]);
        }
        //for(int i:s)si+=i;
        return si/(n-(2*ris));
    }
}