/* 
 * A fancy string is a string where no three consecutive characters are equal.
 * Given a string s, delete the minimum possible number of characters from s to make it fancy
 */

class Solution {
    public String makeFancyString(String s) {
        StringBuilder str = new StringBuilder(s);
        for(int i = str.length() - 2; i > 0; i--) {
            if(str.charAt(i - 1) == str.charAt(i) && str.charAt(i) == str.charAt(i + 1)) {
                str.delete(i, i + 1);
            }
        }
        return str.toString();
    }
}