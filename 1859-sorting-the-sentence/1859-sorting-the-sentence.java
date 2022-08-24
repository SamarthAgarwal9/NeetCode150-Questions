class Solution {
    public String sortSentence(String s) {
        String[] ss=s.split(" ");
        String[] a=new String[ss.length];
        for(String one:ss){
            int n=one.length();
            int ind=one.charAt(n-1)-'0';
            a[ind-1]=one.substring(0,n-1);
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < a.length - 1; i++)
		sb.append(a[i]).append(" ");
	sb.append(a[a.length-1]);
	return sb.toString();
    }
}