class Solution {
    public int minMutation(String start, String end, String[] bank) {
        Queue<String> que=new LinkedList<>();
        HashSet<String> hs=new HashSet<>();
        List<String> li=Arrays.asList(bank);
        int step=0;
        que.add(start);
        hs.add(start);
        while(!que.isEmpty()){
            for(int i=que.size();i>0;i--){
                String s=que.poll();
                if(s.equals(end))return step;
                char[] ch=s.toCharArray();
                for(int k=0;k<8;k++){
                    char c1=ch[k];
                    for(int j=0;j<4;j++){
                        ch[k]="ACGT".charAt(j);
                        String s1=new String(ch);
                        if(!hs.contains(s1)&&li.contains(s1)){
                            que.add(s1);
                            hs.add(s1);
                        }
                    }
                    ch[k]=c1;
                }
            }
            step++;
        }
        return -1;
    }
}