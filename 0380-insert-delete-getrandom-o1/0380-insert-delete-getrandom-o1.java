class RandomizedSet {
    List<Integer> st;
    Map<Integer,Integer> mp=new HashMap<>();
    Random rand=new Random();
    public RandomizedSet() {
        st=new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(st.contains(val))return false;
        mp.put(val,st.size());
        st.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!st.contains(val))return false;
        int ind=mp.remove(val);
        int last=st.remove(st.size()-1);
        if(val!=last){
            st.set(ind,last);
            mp.put(last,ind);
        }
        return true;
    }
    
    public int getRandom() {
        return st.get(rand.nextInt(st.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */