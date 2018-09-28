package medium;

import java.util.Arrays;

/**
 * Given an array nums of n integers and an integer target,
 * find three integers in nums such that the sum is closest to target.
 * Return the sum of the three integers.
 * You may assume that each input would have exactly one solution.
 *
 * Example:
 *
 * Given array nums = [-1, 2, 1, -4], and target = 1.
 *
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 *
 */
public class ThreeNumClosest {

    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return 0;
        }
        int sum = 0;
        int dif = 0;
        Arrays.sort(nums);
        int start = 0;
        int mid, end;
        while (start < nums.length - 2) {
            mid = start + 1;
            end = nums.length - 1;
            if (start == 0 && mid == 1 && end == nums.length - 1) {
                sum = nums[start] + nums[mid] + nums[end];
                dif = target - sum;
            }
            while (mid < end) {
                if (Math.abs(target - (nums[start] + nums[mid] + nums[end])) < Math.abs(dif)) {
                    sum = nums[start] + nums[mid] + nums[end];
                    dif = target - sum;
                }
                if (target - (nums[start] + nums[mid] + nums[end]) < 0) {
                    mid++;
                }
                if (target - (nums[start] + nums[mid] + nums[end]) > 0) {
                    end--;
                }
                if (target == nums[start] + nums[mid] + nums[end]) {
                    return target;
                }
            }
            start++;
        }
        return sum;
    }

    /**
     * 使用暴力遍历方法
     * O(n * n * n)
     * @param nums
     * @param target
     * @return
     */
    public int threeSumClosest2(int[] nums, int target) {
        int dif = 0;
        int sum = 0;
        if (nums == null || nums.length < 3) {
            return 0;
        }
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (i == 0 && j == 1 && k == 2) {
                        sum = nums[i] + nums[j] + nums[k];
                        dif = target - sum;
                    } else {
                        if (Math.abs(target - (nums[i] + nums[j] + nums[k])) < Math.abs(dif)) {
                            sum = nums[i] + nums[j] + nums[k];
                            dif = target - sum;
                        }
                    }
                }
            }
        }
        return sum;
    }
}
