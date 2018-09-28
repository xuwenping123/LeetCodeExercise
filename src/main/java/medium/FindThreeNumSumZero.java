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
     * use three pos!
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        if (nums == null || nums.length < 3) {
            return lists;
        }
        Arrays.sort(nums);
        int mid;
        int end;
        List<Integer> list;
        for (int start = 0; start < nums.length - 2 && nums[start] <= 0; start++) {
            if (start > 0 && nums[start] == nums[start - 1]) {
                continue;
            }
            mid = start + 1;
            end = nums.length - 1;
            while (mid < end) {
                if (nums[start] + nums[mid] + nums[end] == 0) {
                    int tmp_mid = nums[mid],tmp_right= nums[end];
                    list = new ArrayList<Integer>();
                    list.add(nums[start]);
                    list.add(nums[mid]);
                    list.add(nums[end]);
                    lists.add(list);
                    while(mid < end && nums[++mid] == tmp_mid);
                    while(mid < end && nums[--end] == tmp_right);
                } else if (nums[start] + nums[mid] + nums[end] > 0) {
                    end--;
                } else {
                    mid++;
                }
            }
        }
        return lists;
    }


    /**
     * O(n * n * n)
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum2(int[] nums) {
        // TODO  bug
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        if (nums == null || nums.length < 3) {
            return lists;
        }
        List<Integer> list;
        // first sort
        Arrays.sort(nums);
        // a + b + c == 0
        // sure a <= 0 and c >= 0
        for (int i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length && nums[k] >= 0; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        if (contains(lists, nums[i], nums[j], nums[k])) {
                            continue;
                        }
                        list = new ArrayList<Integer>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        lists.add(list);
                    }
                }
            }
        }
        return lists;
    }

    public boolean contains(List<List<Integer>> lists, int a, int b, int c) {
        for (List<Integer> list : lists) {
            if (list.get(0).equals(a) && list.get(1).equals(b) && list.get(2).equals(c)) {
                return true;
            }
        }
        return false;
    }
}
