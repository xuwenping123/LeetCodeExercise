package hard;

import org.junit.Assert;
import org.junit.Test;

public class MedianTwoSortedArraysTest {

    private MedianTwoSortedArrays sortedArrays = new MedianTwoSortedArrays();

    @Test
    public void testLotFindMedian() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        Assert.assertEquals(2, sortedArrays.findMedianSortedArrays(nums1, nums2), 0);
        System.out.println(sortedArrays.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    public void testFindMedian() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        Assert.assertEquals(2.5, sortedArrays.findMedianSortedArrays(nums1, nums2), 0);
    }
}
