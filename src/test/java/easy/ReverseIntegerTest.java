package easy;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {

    private ReverseInteger reverse = new ReverseInteger();

    @Test
    public void testZeroInteger()  {
        int x = 0;
        Assert.assertEquals(0, reverse.reverse3(x));
    }

    @Test
    public void testWithZeroInteger()  {
        int x = 1230;
        Assert.assertEquals(321, reverse.reverse3(x));
    }

    @Test
    public void testPositiveInteger()  {
        int x = 123;
        Assert.assertEquals(321, reverse.reverse3(x));
    }

    @Test
    public void testNegativeInteger()  {
        int x = -123;
        Assert.assertEquals(-321, reverse.reverse3(x));
    }

    @Test
    public void testMaxInteger()  {
        int x = Integer.MAX_VALUE;
        Assert.assertEquals(0, reverse.reverse3(x));
    }

    @Test
    public void testMinInteger()  {
        int x = Integer.MIN_VALUE;
        Assert.assertEquals(0, reverse.reverse3(x));
    }

    @Test
    public void testMoreInteger()  {
        int x = 1534236469;
        Assert.assertEquals(0, reverse.reverse3(x));
    }


}
