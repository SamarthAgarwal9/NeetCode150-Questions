class Solution {
    public String oddString(String[] words) {
        Map<List<Integer>,List<String>> mp =new HashMap();
        for(int i=0;i<words.length;i++){
            char[] ch=words[i].toCharArray();
            List<Integer> li=new ArrayList<>();
            for(int j=0;j<ch.length-1;j++)
                li.add(ch[j+1]-ch[j]);
            if(mp.containsKey(li))
                mp.get(li).add(words[i]);
            else{
                List<String> l1=new ArrayList<>();
                l1.add(words[i]);
                mp.put(li,l1);
            }        
        }
        for (List<Integer> key : mp.keySet()) {
            if (mp.get(key).size() == 1) {
                return mp.get(key).get(0);
            }
        }

        return "";
    }
}