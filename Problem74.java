/* 
 * Given an integer target, return true if target is in matrix or false otherwise.
 */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean found = false;
        int col = matrix.length - 1;

        if(matrix[0].length == 1) {
            for(int i = 0; i < matrix.length; i++) {
                if(matrix[i][0] == target) {
                    return true;
                }
            }
        }

        for(int j = 0; j < matrix.length - 1; j++) {
            if(matrix[j][0] <= target && matrix[j + 1][0] > target) {
                col = j;
            }
        }

        for(int i = 0; i < matrix[col].length; i++) {
            if(matrix[col][i] == target) {
                found = true;
            }
        }
        return found;
    }
}