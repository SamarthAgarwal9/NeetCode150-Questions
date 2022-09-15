class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n=changed.length;
        if(n%2!=0)return new int[]{};
        int[] res=new int[n/2];
        Arrays.sort(changed);
        int l=0;
        int[] cnt = new int[200005];
        for (int x : changed) cnt[x] += 1;
        for (int i = 0; i < 200005; i++) 
            if (cnt[i] > 0) {
                cnt[i] -= 1;
                if (cnt[i * 2] > 0) {
                    cnt[i * 2] -= 1;
                    res[l++] = i--;
                }
                else 
                    return new int[]{};
            }
        return res;
    }
}