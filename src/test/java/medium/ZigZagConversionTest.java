package medium;

import org.junit.Assert;
import org.junit.Test;

public class ZigZagConversionTest {

    private ZigZagConversion conversion = new ZigZagConversion();

    @Test
    public void testDemoString() {
        String str = "PAYPALISHIRING";
        int numRows = 3;
        Assert.assertEquals("PAHNAPLSIIGYIR", conversion.convert(str, numRows));
    }

    @Test
    public void testDemo2String() {
        String str = "PAYPALISHIRING";
        int numRows = 4;
        Assert.assertEquals("PINALSIGYAHRPI", conversion.convert(str, numRows));
    }

    @Test
    public void testDemo3String() {
        String str = "0123456";
        int numRows = 3;
        Assert.assertEquals("0413526", conversion.convert(str, numRows));
    }
}
