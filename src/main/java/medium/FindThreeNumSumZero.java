package medium;

import java.util.*;

/**
 * Given an array nums of n integers, are there elements a, b, c in nums
 * such that a + b + c = 0? Find all unique triplets in the array
 * which gives the sum of zero.
 *
 * Note:
 *
 * The solution set must not contain duplicate triplets.
 *
 * Example:
 *
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 *
 * A solution set is:
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 *
 */
public class FindThreeNumSumZero {

    /**
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return null;
        }
        Arrays.sort(nums);
        int start = 0;
        int mid, end;

        return null;
    }


    /**
     * O(n * n * n)
     * 方法可用，但是超时    Time Limit Exceeded
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        if (nums == null || nums.length < 3) {
            return lists;
        }
        List<Integer> list;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        list = new ArrayList<Integer>();
                        if (contains(lists, nums[i], nums[j], nums[k])) {
                            continue;
                        }
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        Collections.sort(list);
                        lists.add(list);
                    }
                }
            }
        }
        return lists;
    }

    public boolean contains(List<List<Integer>> lists, int a, int b, int c) {
        List<Integer> test;
        for (List<Integer> list : lists) {
            test = new ArrayList<Integer>(list);
            test.remove(new Integer(a));
            test.remove(new Integer(b));
            test.remove(new Integer(c));
            if (test.size() == 0) {
                return true;
            }
        }
        return false;
    }
}
