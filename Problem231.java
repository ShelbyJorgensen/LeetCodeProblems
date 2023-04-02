/* 
 * Given an integer n, return true if it is a power of two. Otherwise, return false.
 */

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 0) {
            return false;
        }
        while(n % 2 == 0) {
            n = n / 2;
        }
        return n == 1;
    }
}