/*
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 */

class Solution {
    public boolean isPalindrome(int x) {
        String pal = Integer.toString(x);
        StringBuilder pal2 = new StringBuilder();
        pal2.append(pal);
        pal2.reverse();
        String newPal = pal2.toString();
        for(int i = 0; i < pal.length(); i++) {
            if(pal.charAt(i) != newPal.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}