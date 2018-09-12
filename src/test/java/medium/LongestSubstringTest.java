package medium;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringTest {

    private LongestSubstring run = new LongestSubstring();

    @Test
    public void testNullString() {
        String str = null;
        Assert.assertEquals(0, run.lengthOfLongestSubstringPos(str));
    }

    @Test
    public void testEmptyString() {
        String str = "";
        Assert.assertEquals(0, run.lengthOfLongestSubstringPos(str));
    }

    @Test
    public void testOneCharString() {
        String str = "a";
        Assert.assertEquals(1, run.lengthOfLongestSubstringPos(str));
    }

    @Test
    public void testTwoDiffCharString() {
        String str = "ab";
        Assert.assertEquals(2, run.lengthOfLongestSubstringPos(str));
    }

    @Test
    public void testTwoSameCharString() {
        String str = "aa";
        Assert.assertEquals(1, run.lengthOfLongestSubstringPos(str));
    }

    @Test
    public void testThreeCharString() {
        String str = "aab";
        Assert.assertEquals(2, run.lengthOfLongestSubstringPos(str));
    }

    @Test
    public void testFourCharString() {
        String str = "dedf";
        Assert.assertEquals(3, run.lengthOfLongestSubstringPos(str));
    }

    @Test
    public void testMoreCharString() {
        String str = "abcabcbb";
        Assert.assertEquals(3, run.lengthOfLongestSubstringPos(str));
    }
}
