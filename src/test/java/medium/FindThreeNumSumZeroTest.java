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
        List<List<Integer>> lists = sum.threeSum(nums);
        System.out.println(lists);
    }

}