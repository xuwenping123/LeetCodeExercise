package medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerToRomanTest {

    private IntegerToRoman to;

    @Before
    public void setUp() throws Exception {
        to = new IntegerToRoman();
    }

    @Test
    public void intToRoman1Test() {
        int num = 3;
        Assert.assertEquals("III", to.intToRoman(num));
    }


    @Test
    public void intToRoman2Test() {
        int num = 4;
        Assert.assertEquals("IV", to.intToRoman(num));
    }

    @Test
    public void intToRoman3Test() {
        int num = 9;
        Assert.assertEquals("IX", to.intToRoman(num));
    }

    @Test
    public void intToRoman4Test() {
        int num = 58;
        Assert.assertEquals("LVIII", to.intToRoman(num));
    }

    @Test
    public void intToRoman5Test() {
        int num = 1994;
        Assert.assertEquals("MCMXCIV", to.intToRoman(num));
    }
}