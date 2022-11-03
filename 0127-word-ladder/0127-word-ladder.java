class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
//         Set<String> set=new HashSet<>(wordList);
//         if(!set.contains(endWord))return 0;
//         Queue<String> que=new LinkedList<>();
//         Set<String> set1=new HashSet<>();
//         que.add(beginWord);
//         set1.add(beginWord);
//         int res=1;
//         while(!que.isEmpty()){
//             int size=que.size();
//             for(int i=0;i<size;i++){
//                 String s=que.poll();
//                 if(s.equals(endWord))return res;
//                 for(int j=0;j<s.length();j++){
//                     for(int k='a';k<='z';k++){
//                         char[] ch=s.toCharArray();
//                         ch[j]=(char)k;
                        
//                         String demo=new String(ch);
//                         if(!que.contains(demo)&&set.contains(demo)){
//                             que.add(demo);
//                             set1.add(demo);
//                         }
//                     }
//                 }
//             }
//                 res++;
            
//         }
//         return 0;
//     }
        Set<String> set = new HashSet<>(wordList);
        if(!set.contains(endWord)) return 0;
        
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        
        Set<String> visited = new HashSet<>();
        queue.add(beginWord);
        
        int changes = 1;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                String word = queue.poll();
                if(word.equals(endWord)) return changes;
                
                for(int j = 0; j < word.length(); j++){
                    for(int k = 'a'; k <= 'z'; k++){
                        char arr[] = word.toCharArray();
                        arr[j] = (char) k;
                        
                        String str = new String(arr);
                        if(set.contains(str) && !visited.contains(str)){
                            queue.add(str);
                            visited.add(str);
                        }
                    }
                }
            }
            ++changes;
        }
        return 0;
    }
}