package hard;

import org.junit.Assert;
import org.junit.Test;

public class RegularExpressionMatchTest {

    private RegularExpressionMatch match = new RegularExpressionMatch();

    @Test
    public void testSameMatch() {
        String s = "same";
        String p = "same";
        Assert.assertTrue(match.isMatch(s, p));
    }

    @Test
    public void testDifMatch() {
        String s = "aaa";
        String p = "aaaa";
        Assert.assertFalse(match.isMatch(s, p));
    }
}
