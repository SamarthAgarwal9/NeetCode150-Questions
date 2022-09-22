class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> set=new HashSet<>();
        Set<String> set2=new HashSet<>();
        for(List<String> l1:paths)
            set.add(l1.get(1));
        for(List<String> l1:paths){
            set2.add(l1.get(0));
        }
        for(String c:set){
            if(!set2.contains(c))return c;
        }
        return "";
    }
}