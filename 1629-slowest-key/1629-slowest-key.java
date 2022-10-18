class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int res=releaseTimes[0];
        char rc=keysPressed.charAt(0);
        for(int i=1;i<releaseTimes.length;i++){
            int diff=releaseTimes[i]-releaseTimes[i-1];
            if(diff>res){res=diff;rc=keysPressed.charAt(i);}
            else if(diff==res){
                if(keysPressed.charAt(i)>rc) 
                    rc=keysPressed.charAt(i);
            }
        }
        return rc;
    }
}