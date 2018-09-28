package medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FourSumTest {

    private FourSum fourSum;
    @Before
    public void setUp() {
        fourSum = new FourSum();
    }

    @Test
    public void testFourSum() {
        int[] nums = {-2, -1, 0, 0, 1, 2};
        int target = 0;
        System.out.println(fourSum.fourSum(nums, target));
    }

    @Test
    public void testFourSum4() {
        int[] nums = {1, 0, -1, 0};
        int target = 0;
        System.out.println(fourSum.fourSum(nums, target));
    }
}