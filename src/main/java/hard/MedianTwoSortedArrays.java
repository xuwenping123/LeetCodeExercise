package hard;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 *
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 *
 * You may assume nums1 and nums2 cannot be both empty.
 *
 * Example 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * The median is 2.0
 * Example 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * The median is (2 + 3)/2 = 2.5
 *
 */
public class MedianTwoSortedArrays {

    /**
     * O(n)
     * 使用了归并排序中关于两个数组合并成一个数组的思想
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        boolean flag = (nums1.length + nums2.length) % 2 != 0;
        int temp = (nums1.length + nums2.length) / 2 + 1;
        int[] array = new int[temp];
        int i = 0;
        int j = 0;
        int k = 0;
        for (; k < temp; k++) {
            if (i == nums1.length || j == nums2.length) {
                break;
            }
            array[k] = nums1[i] <= nums2[j] ? nums1[i++] : nums2[j++];
        }
        if (k != temp && i == nums1.length) {
            for (; k < temp; k++) {
                array[k] = nums2[j++];
            }
        }
        if (k != temp && j == nums2.length) {
            for (; k < temp; k++) {
                array[k] = nums1[i++];
            }
        }
        if (flag) {
            return array[temp - 1];
        } else {
            return (double) (array[temp - 1] + array[temp - 2]) / 2;
        }
    }
}
