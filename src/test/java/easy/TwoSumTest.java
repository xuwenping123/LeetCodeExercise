package easy;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {
    TwoSum twoSum = new TwoSum();

    @Test
    public void solveNull() {
        Assert.assertEquals(null, twoSum.solve(null, 0));
    }

    @Test
    public void solveOneFalse() {
        Assert.assertEquals(null, twoSum.solve(new int[]{1}, 0));
    }

    @Test
    public void solveOneTrue() {
        Assert.assertEquals(null, twoSum.solve(new int[]{1}, 1));
    }

    @Test
    public void solveMoreFalse() {
        Assert.assertEquals(null, twoSum.solve(new int[]{1, 2, 3}, 1));
    }

    @Test
    public void solveMoreTrue() {
        Assert.assertArrayEquals(new int[] {1, 2}, twoSum.solve(new int[]{1, 2, 3}, 5));
    }
}
