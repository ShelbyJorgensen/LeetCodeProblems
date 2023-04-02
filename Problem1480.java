/*
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 */

class Solution {
    public int[] runningSum(int[] nums) {
        int[] solution = new int[nums.length];
        int total = 0;
        for(int i = 0; i < nums.length; i++) {
            total += nums[i];
            solution[i] = total;
        }
        return solution;
    }
}