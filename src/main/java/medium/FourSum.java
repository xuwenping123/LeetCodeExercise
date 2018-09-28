package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
 *
 * Note:
 *
 * The solution set must not contain duplicate quadruplets.
 *
 * Example:
 *
 * Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.
 *
 * A solution set is:
 * [
 *   [-1,  0, 0, 1],
 *   [-2, -1, 1, 2],
 *   [-2,  0, 0, 2]
 * ]
 */
public class FourSum {

    /**
     * 参考 3Sum
     * @param nums
     * @param target
     * @return
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums == null || nums.length < 4) {
            return result;
        }
        Arrays.sort(nums);
        int i = 0;
        int j, k, l;
        List<Integer> list;
        while (i < nums.length - 3) {
            j = i + 1;
            while (j < nums.length - 2) {
                k = j + 1;
                l = nums.length - 1;
                while (k < l) {
                    if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
                        list = new ArrayList<Integer>(4);
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[l]);
                        result.add(list);
                        while(k < l && nums[k] == nums[++k]);
                    } else if (nums[i] + nums[j] + nums[k] + nums[l] > target) {
                        while(k < l && nums[l] == nums[--l]);
                    } else {
                        while(k < l && nums[k] == nums[++k]);
                    }
                }
                while (j < nums.length - 2 && nums[j] == nums[++j]);
            }
            while (i < nums.length - 3 && nums[i] == nums[++i]);
        }
        return result;
    }
}
