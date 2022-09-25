class Solution {
    public int countTriplets(int[] arr) {
        int res=0,n=arr.length+1;
        int[] prefix=new int[n+1];
        for(int i=1;i<n;i++)
            prefix[i]=arr[i-1]^prefix[i-1];
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
                if(prefix[j]==prefix[i])
                    res+=j-i-1;
        return res;
    }
}