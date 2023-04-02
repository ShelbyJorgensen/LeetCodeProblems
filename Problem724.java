/*
 * Given an array of integers nums, calculate the pivot index of this array.
 */

class Solution {
    public int pivotIndex(int[] nums) {
        int pivot = -1;
        int leftSum = 0;
        int rightSum = 0;
        for(int i = nums.length - 1; i > -1; i--)  {
            rightSum += nums[i];
        }
        for(int i = 0; i < nums.length; i++)  {
        	leftSum += nums[i];
            if(rightSum == leftSum) {
                return i;
            }
            rightSum -= nums[i];
        }
        return pivot;
    }
}