package medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ThreeNumClosestTest {

    private ThreeNumClosest run;

    @Before
    public void setUp() throws Exception {
        run = new ThreeNumClosest();
    }

    @Test
    public void testThreeSumClosest() {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        Assert.assertEquals(2, run.threeSumClosest(nums, target));
    }

    @Test
    public void testThreeSumClosestZero() {
        int[] nums = {0, 0, 0};
        int target = 1;
        Assert.assertEquals(0, run.threeSumClosest(nums, target));
    }

    @Test
    public void testThreeSumClosestTwo() {
        int[] nums = {1, 2, 3};
        int target = 3;
        Assert.assertEquals(6, run.threeSumClosest(nums, target));
    }

    @Test
    public void testThreeSumClosestError() {
        int[] nums = {0, 2, 1, -3};
        int target = 1;
        Assert.assertEquals(0, run.threeSumClosest(nums, target));
    }
}