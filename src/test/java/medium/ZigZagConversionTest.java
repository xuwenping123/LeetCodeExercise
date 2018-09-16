package medium;

import org.junit.Assert;
import org.junit.Test;

public class ZigZagConversionTest {

    private ZigZagConversion conversion = new ZigZagConversion();

    /**
     * numRows != 1
     */
    @Test
    public void testLong2String() {
        String str = "01";
        int numRows = 1;
        Assert.assertEquals("01", conversion.convert(str, numRows));
    }

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

    @Test
    public void testDemo4String() {
        String str = "012345678";
        int numRows = 4;
        Assert.assertEquals("061572483", conversion.convert(str, numRows));
    }

    @Test
    public void testDemo5String() {
        String str = "0123456789A";
        int numRows = 4;
        Assert.assertEquals("06157248A39", conversion.convert(str, numRows));
    }
}
