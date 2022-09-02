class Solution {
    public int nextGreaterElement(int n) {
       String s=Integer.toString(n);
        int[] arr=new int[s.length()];
        for(int i=0;i<s.length();i++)
            arr[i]=(int)(s.charAt(i)-'0');
        int i=s.length()-2;
        while(i>=0&&arr[i]>=arr[i+1])i--;
        if(i==-1)return -1;
        for(int ind=arr.length-1;ind>=0;ind--){
            if(arr[ind]>arr[i]){
                int temp=arr[i];
                arr[i]=arr[ind];
                arr[ind]=temp;
                break;
            }
        }
        Arrays.sort(arr,i+1,arr.length);
        long res=0;
        for(i=0;i<arr.length;i++) res=res*10+arr[i];
        return res > Integer.MAX_VALUE ? -1: (int)res;
    }
}