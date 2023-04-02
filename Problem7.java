/*
 * Given a signed 32-bit integer x, return x with its digits reversed. 
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 */
class Solution {
    public int reverse(int x) {
        long val;
        StringBuilder rev = new StringBuilder(String.valueOf(x));
        if(rev.charAt(0) == '-') {
            rev.delete(0,1);
            rev.reverse();
            val = Long.parseLong(rev.toString()) * -1;
        } else {
            rev.reverse();
            val = Long.parseLong(rev.toString());
        }
        if(val >= 2147483647 || val <= -2147483647) {
            return 0;
        } else {
            return (int) val;
        }
    }
}