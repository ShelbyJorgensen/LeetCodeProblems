/* 
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 */

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = -1;
        int j = -1;
	boolean isTrue = false;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        // Iterate through the provided array
        for(int n = 0; n < nums.length; n++) {
        	// If the current array value isn't, store the value as the key and current index as value
        	if(!map.containsKey(nums[n])) {
        		map.put(nums[n], n);
        	} else {
        		// Check if the previous index of arr[k], and the current index subtracted from eachother is less than k
        		int temp = map.get(nums[n]);
        		if(Math.abs(temp - n) <= k) {
        			isTrue = true;
        		} 
        		// If not less than/equal to k, than update the value of n incase of another instance of nums[k] in nums
        		else {
        			map.put(nums[n], n);
        		}
        	}
        }
        
        return isTrue;
    }
}