/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l=1,r=n;
        if(guess(l)==0)return l;
        if(guess(r)==0)return r;
        while(l<r){
            int mid=l+(r-l)/2;
            if(guess(mid)==0)return mid;
            else if(guess(mid)==1)l=mid+1;
            else r=mid;
        }
        return -1;
    }
}