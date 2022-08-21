class Solution {
    public String largestPalindromic(String num) {
int[] n = new int[10];
        for (char c : num.toCharArray()) {
            n[c - '0']++;
        }
        boolean only = false;
		//seperate the result into 3 parts, the first half and second half, also the center (if exist)
        StringBuilder sbPre = new StringBuilder();
        StringBuilder sbPost = new StringBuilder();
        StringBuilder sbOnly = new StringBuilder();
		//check from 9 to 1, to make it the largest
        for (int i = 9; i >= 0; i--) {
		    //check for center
            if (n[i] % 2 != 0 && !only) {
                only = true;
                sbOnly.append(Integer.toString(i));
            }
			//handle special case of all '0' or '0' is the first digit(invalid) 
            if (i == 0 && sbPre.length() == 0) {
                if (n[i] > 0 && sbOnly.length() == 0) sbOnly.append(Integer.toString(i));
                return sbOnly.toString();
            }
            for (int j = 0; j < n[i] / 2; j++) {
                sbPre.append(Integer.toString(i));
                sbPost.insert(0, Integer.toString(i));
            }
        }
        sbPre.append(sbOnly);
        sbPre.append(sbPost);
        return sbPre.toString();
    }
}