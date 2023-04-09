/*
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors.
 * '#' means a backspace character.
 */

class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '#') {
                if(s1.length() == 0) {
                    continue;
                }
                s1.deleteCharAt(s1.length() - 1);
            } else {
                s1.append(s.charAt(i));
            }
        }
        for(int i = 0; i < t.length(); i++) {
            if(t.charAt(i) == '#') {
                if(s2.length() == 0) {
                    continue;
                }
                s2.deleteCharAt(s2.length() - 1);
            } else {
                s2.append(t.charAt(i));
            }
        }

        if(s1.toString().equals(s2.toString())) {
            return true;
        } else {
            return false;
        }
    }
}
