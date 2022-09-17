class Solution {
    // public List<List<Integer>> palindromePairs(String[] words) {
    //     List<List<Integer>> res=new ArrayList<>();
    //     if(words==null) return res;
    //     int n=words.length;
    //     HashMap<String ,Integer> map=new HashMap<>();
    //     for(int i=0;i<n;i++) map.put(words[i],i);
    //     // for(int j=0;j<n;j++){
    //     //     int l=0,r=0;
    //     //     while(l<=r){
    //     //         String s=words[j].substring(l,r);
    //     //         Integer temp=mp.get(new StringBuilder(s).reverse().toString());
    //     //         if(temp!=null && j!=temp && palin(words[j].substring(l==0?r:0,l==0?words[j].length():l)))
    //     //            res.add(Arrays.asList(l==0?new Integer[]{j,temp}:new Integer[]{temp,j}));
    //     //          if(r<words[j].length())r++;
    //     //            else l++;
    //     //     }
    //     // }
    //     for (int i = 0; i < words.length; ++ i) {
    //     int l = 0, r = 0;
    //     while (l <= r) {
    //         String s = words[i].substring(l, r);
    //         Integer j = map.get(new StringBuilder(s).reverse().toString());
    //         if (j != null && i != j && palin(words[i].substring(l == 0 ? r : 0, l == 0 ? words[i].length() : l)))
    //             res.add(Arrays.asList(l == 0 ? new Integer[]{i, j} : new Integer[]{j, i}));
    //         if (r < words[i].length()) ++r;
    //         else ++l;
    //     }
    // }
    //     return res;
    // }
    // boolean palin(String s){
    //     int i=0,j=s.length()-1;
    //     while(i<j){
    //         if(s.charAt(i)!=s.charAt(j))return false;
    //         i++;
    //         j--;
    //     }
    //     return true;
    // }
    public List<List<Integer>> palindromePairs(String[] words) {
    List<List<Integer>> pairs = new LinkedList<>();
    if (words == null) return pairs;
    HashMap<String, Integer> map = new HashMap<>();
    for (int i = 0; i < words.length; ++ i) map.put(words[i], i);
    for (int i = 0; i < words.length; ++ i) {
        int l = 0, r = 0;
        while (l <= r) {
            String s = words[i].substring(l, r);
            Integer j = map.get(new StringBuilder(s).reverse().toString());
            if (j != null && i != j && isPalindrome(words[i].substring(l == 0 ? r : 0, l == 0 ? words[i].length() : l)))
                pairs.add(Arrays.asList(l == 0 ? new Integer[]{i, j} : new Integer[]{j, i}));
            if (r < words[i].length()) ++r;
            else ++l;
        }
    }
    return pairs;
}

private boolean isPalindrome(String s) {
    for (int i = 0; i < s.length()/2; ++ i)
        if (s.charAt(i) != s.charAt(s.length()-1-i))
            return false;
    return true;
}
}