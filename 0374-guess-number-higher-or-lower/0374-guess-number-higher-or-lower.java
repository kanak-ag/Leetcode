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
        int mid=0,s=0;
        int e=n;
        while(s<=e)
        {
            mid=s+(e-s)/2;
            if(guess(mid)==0)
            return mid;
            else if(guess(mid)==-1)
            e=mid-1;
            else
            s=mid+1;



        }
        return mid;
        
    }
}