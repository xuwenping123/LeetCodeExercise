package easy;

import java.util.Arrays;
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
	 * O(n * n)
	 */
    public int[] twoSum(int[] nums, int target) {
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
     * error 
     * 
     * can not change arrays index
     */
    public int[] twoSum1(int[] nums, int target) {
    	Arrays.sort(nums);
    	int start = 0;
    	int end = nums.length - 1;
    	int temp;
    	while(start < end) {
    		temp = nums[start] + nums[end];
    		if (temp == target) {
				return new int[] {start, end};
			} else if (temp < target) {
				start++;
				end = nums.length - 1;
			} else {
				end--;
			}
    	}
    	return null;
    }
    
    /**
     * right
     * 
     * use hashMap quickly select
     */
    public int[] twoSum2(int[] nums, int target) {
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for (int i = 0; i < nums.length; i++) {
    		map.put(nums[i], i);
    	}
    	for (int i = 0; i < nums.length; i++) {
    		if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
				return new int[] {i, map.get(target - nums[i])}; 
			}
    	}
    	return null;
    }
    
    /**
     * rigth 
     * 
     * twoSum2 better
     */
    public int[] twoSum3(int[] nums, int target) {
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	int temp;
    	for (int i = 0; i < nums.length; i++) {
    		temp = target - nums[i];
    		if (map.containsKey(temp) && map.get(temp) != i) {
				return new int[] {i, map.get(temp)};
			}
    		map.put(nums[i], i);
    	}
    	return null;
    }
    
    public static void main(String[] args) {
    	int[] nums = {3, 2, 4};
    	int target = 6;
		TwoSum twoSum = new TwoSum();
		System.out.println(twoSum.twoSum(nums, target)[0] + "---" +twoSum.twoSum(nums, target)[1]);
    }
}
