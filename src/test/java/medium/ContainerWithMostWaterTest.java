package medium;


import org.junit.Assert;
import org.junit.Test;

public class ContainerWithMostWaterTest {

    private ContainerWithMostWater container = new ContainerWithMostWater();


    @Test
    public void testMaxArea() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        Assert.assertEquals(49, container.maxArea2(height));
    }

    @Test
    public void testMax2Area() {
        int[] height = {1,8,7};
        Assert.assertEquals(7, container.maxArea2(height));
    }
}