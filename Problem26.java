/*
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
 * The relative order of the elements should be kept the same.
 */

class Solution {
    public int removeDuplicates(int[] nums) {

        int indx = 1;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] < nums[i + 1]) {
                nums[indx] = nums[i + 1];
                indx++;
            }
        }
        return indx;
    }
}