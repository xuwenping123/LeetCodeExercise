package medium;

import org.junit.Assert;
import org.junit.Test;

public class StringConverIntegerTest {

    private StringConverInteger conver = new StringConverInteger();

    @Test
    public void testDigits() {
        String str = "42";
        Assert.assertEquals(42, conver.myAtoi(str));
    }

    @Test
    public void testSpaceDigits() {
        String str = "  42";
        Assert.assertEquals(42, conver.myAtoi(str));
    }

    @Test
    public void testPositiveDigits() {
        String str = "  +42";
        Assert.assertEquals(42, conver.myAtoi(str));
    }

    @Test
    public void testMixDigits() {
        String str = " -+42";
        Assert.assertEquals(0, conver.myAtoi(str));
        str = "+-42";
        Assert.assertEquals(0, conver.myAtoi(str));
    }

    @Test
    public void testNegativeSpaceDigits() {
        String str = "  -42";
        Assert.assertEquals(-42, conver.myAtoi(str));
    }

    @Test
    public void testAddNegativeStrDigits() {
        String str = "  -42 add String";
        Assert.assertEquals(-42, conver.myAtoi(str));
    }

    @Test
    public void testAddStrDigits() {
        String str = "4193 with words";
        Assert.assertEquals(4193, conver.myAtoi(str));
    }

    @Test
    public void testErrorDigits() {
        String str = " String -42";
        Assert.assertEquals(0, conver.myAtoi(str));
    }

    @Test
    public void testError2Digits() {
        String str = "   +0 123";
        Assert.assertEquals(0, conver.myAtoi(str));
    }

    @Test
    public void testMaxDigits() {
        String str = " 91283472332";
        Assert.assertEquals(Integer.MAX_VALUE, conver.myAtoi(str));
    }

    @Test
    public void testOrderLongMaxDigits() {
        String str = "9223372036854775808";
        Assert.assertEquals(Integer.MAX_VALUE, conver.myAtoi(str));
    }

    @Test
    public void testMinDigits() {
        String str = " -91283472332";
        Assert.assertEquals(Integer.MIN_VALUE, conver.myAtoi(str));
    }

    @Test
    public void testAddDigits() {
        String str = "-5-";
        Assert.assertEquals(-5, conver.myAtoi(str));
    }

    @Test
    public void testAdd2Digits() {
        String str = "18446744073709551617";
        Assert.assertEquals(Integer.MAX_VALUE, conver.myAtoi(str));
    }
}
