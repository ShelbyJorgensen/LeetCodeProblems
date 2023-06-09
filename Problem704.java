/*
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. 
 * If target exists, then return its index. Otherwise, return -1.
 */
 
class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = low + (high - low) / 2;

        while(true) {
            if(high < low) {
                break;
            }

            mid = low + (high - low) / 2;

            if(nums[mid] < target) {
                low = mid + 1;
            }
            if(nums[mid] > target) {
                high = mid - 1;
            }
            if(nums[mid] == target) {
                return mid;
            }
        }

        return -1;
    }
}
