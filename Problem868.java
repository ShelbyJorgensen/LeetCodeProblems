/*
 * Given a positive integer n, find and return the longest distance between any two adjacent 1's in the binary representation of n. If there are no two adjacent 1's, return 0.
 */

class Solution {
    public int binaryGap(int n) {
        StringBuilder binary = new StringBuilder();
        while(n > 0) {
            if(n % 2 != 0) {
                binary.insert(0, "1");
            } else {
                binary.insert(0, "0");
            }
            n = n / 2;
        }
        String bin = binary.toString();

        int count = 0;
        int longest = 0;
        for(int i = 0; i < bin.length(); i++) {
            if(bin.charAt(i) == '1') {
                if(count > longest) {
                    longest = count;
                }
                count = 0;
            }
            count++;
        }
        return longest;
    }
}