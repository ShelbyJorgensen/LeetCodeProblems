/* 
 * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
 */

class Solution {
    public int addDigits(int num) {
        int ret = 0;

        while(num != 0) {
            ret += num % 10;
            num /= 10;
            if(num == 0 & ret >= 10) {
                num = ret;
                ret = 0;
            }
        }
        return ret;
    }
}