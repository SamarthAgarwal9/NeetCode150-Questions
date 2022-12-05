class Solution {
    public long dividePlayers(int[] skill) {
        int n=skill.length;
        if(n==2) return (long)(skill[0]*skill[1]);
        Arrays.sort(skill);
        long sum=skill[n-1]+skill[0];
        long res=skill[n-1]*skill[0];
        for(int i=1;i<(n/2);i++){
            if(skill[i]+skill[n-1-i]==sum)res+=skill[n-1-i]*skill[i];
            else return -1;
        }
        return res;
    }
}