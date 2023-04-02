/*
 * Given a roman numeral, convert it to an integer.
 */

class Solution {
    public int romanToInt(String s) {
        int x = 0;
        for(int i = 0; i < s.length(); i++) {
            if((s.charAt(i) == 'I' && i < s.length() - 1) && ((s.charAt(i + 1) == 'V') || (s.charAt(i + 1) == 'X'))) {
                x--;
            } else if(s.charAt(i) == 'I') {
                x++;
            }
            if(s.charAt(i) == 'V') {
                x = x + 5;
            }
            if((s.charAt(i) == 'X' && i < s.length() - 1) && ((s.charAt(i + 1) == 'L') || (s.charAt(i + 1) == 'C'))) {
                x = x - 10;
            } else if(s.charAt(i) == 'X') {
                x = x + 10;
            }
            if(s.charAt(i) == 'L') {
                x += 50;
            }
            if((s.charAt(i) == 'C' && i < s.length() - 1) && ((s.charAt(i + 1) == 'D') || (s.charAt(i + 1) == 'M'))) {
                x = x - 100;
            } else if(s.charAt(i) == 'C') {
                x = x + 100;
            }
            if(s.charAt(i) == 'D') {
                x += 500;
            }
            if(s.charAt(i) == 'M') {
                x += 1000;
            }
        }
        return x;
    }
}