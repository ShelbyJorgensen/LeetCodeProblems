/* 
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */

class Solution {
    public int strStr(String haystack, String needle) {
        int idx = -1;
        int length = haystack.length() - needle.length() + 1;
        for(int i = 0; i < length; i++) {
            if(haystack.substring(i, i + needle.length()).equals(needle)){
                return i;
            }
        }
        if(haystack.equals(needle)) {
            idx = 0;
        }
        return idx;
    }
}