package easy;

import org.junit.Assert;
import org.junit.Test;

public class AddStringsTest {

    AddStrings addStrings = new AddStrings();

    @Test
    public void solveMore() {
        Assert.assertEquals("2469135780", addStrings.addStrings("1234567890", "1234567890"));
    }

    @Test
    public void solveNull() {
        Assert.assertEquals("1234567890", addStrings.addStrings("1234567890", null));
    }
}
