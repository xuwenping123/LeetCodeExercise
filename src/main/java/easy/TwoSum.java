package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Two Sum
 * 
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
public class TwoSum {

	/**
	 * use array
	 * O(n * n)
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] solve2(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[]{i, j};
				}
			}
		}
		return null;
	}

	/**
	 * use HashMap
	 * O(n)
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] solve(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		int[] array = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				array[0] = map.get(target - nums[i]);
				array[1] = i;
				return array;
			}
			map.put(nums[i], i);
		}
		return null;
	}
}
