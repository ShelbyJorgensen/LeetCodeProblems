/*
 * Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
  */
  
 class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<Character>();
        int length = 0;

        for(char c : s.toCharArray()) {
            // Match found
            if(set.contains(c)) {
                set.remove(c);
                length += 2;
            } else {
                set.add(c);
            }
        }

        if(set.size() > 0) {
            return length + 1;
        } else {
            return length;
        }
    }
}
