/* 
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 */

class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        int[] sorted = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            count[nums[i]] += 1;
        }

        for(int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }

        for(int i = nums.length - 1; i >= 0; i--) {
            sorted[count[nums[i]] - 1] = nums[i];
            count[nums[i]] -= 1; 
        }

        for(int i = 0; i < nums.length; i++) {
            nums[i] = sorted[i];
        }
    }
}