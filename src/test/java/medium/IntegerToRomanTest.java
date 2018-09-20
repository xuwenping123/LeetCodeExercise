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
    public void intToRomanTest() {
        int num = 4;
        Assert.assertEquals("IV", to.intToRoman(num));
    }
}