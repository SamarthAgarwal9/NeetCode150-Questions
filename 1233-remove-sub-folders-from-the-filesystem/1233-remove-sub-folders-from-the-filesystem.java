class Solution {
    public List<String> removeSubfolders(String[] folder) {
    Arrays.sort(folder);
        List<String> li=new ArrayList<>();
        for(String str:folder){
            if(li.isEmpty()|| !str.startsWith(li.get(li.size()-1)+"/"))
                li.add(str);
        }
        return li;
    }
}