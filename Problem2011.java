/* 
 * Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.
 */

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int sum = 0;
        for(int j = 0; j < operations.length; j++) {
            if(operations[j].charAt(1) == '-') {
                sum--;
            } else {
                sum++;
            }
        }
        return sum;
    }
}