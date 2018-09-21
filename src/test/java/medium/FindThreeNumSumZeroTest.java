package medium;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FindThreeNumSumZeroTest {

    private FindThreeNumSumZero sum;

    @Before
    public void setUp() {
        sum = new FindThreeNumSumZero();
    }

    @Test
    public void test3Sum() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = sum.threeSum2(nums);
        System.out.println(lists);
    }

    @Test
    public void testEmpty3Sum() {
        int[] nums = {};
        List<List<Integer>> lists = sum.threeSum2(nums);
        System.out.println(lists);
    }

    /**
     * [[-4,-2,6],[-4,0,4],[-4,1,3],[-4,2,2],[-2,-2,4],[-2,0,2]]
     * [[-5,1,4],[-4,0,4],[-4,1,3],[-2,-2,4],[-2,1,1],[0,0,0]]
     */
    @Test
    public void testRepeat3Sum() {
        int[] nums = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        List<List<Integer>> lists = sum.threeSum2(nums);
        System.out.println(lists);

        int[] nums2 = {-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};
        lists = sum.threeSum2(nums2);
        System.out.println(lists);
    }
}