package hard;

import org.junit.Assert;
import org.junit.Test;

public class RegularExpressionMatchTest {

    private RegularExpressionMatch match = new RegularExpressionMatch();

    @Test
    public void testSame() {
        String s = "same";
        String p = "same";
        Assert.assertTrue(match.isMatch(s, p));
    }
}
