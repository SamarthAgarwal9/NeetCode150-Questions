class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int n=target.length;
        if(n==1) return target[0]==arr[0];
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(target[i]==arr[j])
                    reverse(arr,i,j);
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=target[i])return false;
        }
        return true;
    }
    void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}