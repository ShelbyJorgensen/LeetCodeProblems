/*
 * You are given an array of integers nums. 
 * You are also given an integer original which is the first number that needs to be searched for in nums.
 */

class Solution {
    public int findFinalValue(int[] nums, int original) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == original) {
                original = (original * 2);
                i = -1;
            }
        }
        return original;
    }
}