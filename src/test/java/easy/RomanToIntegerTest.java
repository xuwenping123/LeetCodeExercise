package easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanToIntegerTest {

    private RomanToInteger to;

    @Before
    public void setUp() {
        to = new RomanToInteger();
    }

    @Test
    public void romanToIntTest() {
        String s = "MCMXCIV";
        Assert.assertEquals(1994, to.romanToInt(s));
    }
}