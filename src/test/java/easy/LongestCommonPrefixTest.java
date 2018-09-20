package easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {

    private LongestCommonPrefix prefix;

    @Before
    public void setUp() {
        prefix = new LongestCommonPrefix();
    }

    @Test
    public void testLongestCommonPrefix() {
        String[] strs = {"flower","flow","flight"};
        Assert.assertEquals("fl", prefix.longestCommonPrefix2(strs));
    }

    @Test
    public void testLongestNoCommonPrefix() {
        String[] strs = {"dog","racecar","car"};
        Assert.assertEquals("", prefix.longestCommonPrefix2(strs));
    }

    @Test
    public void testLongestOneCommonPrefix() {
        String[] strs = {"d","r","c"};
        Assert.assertEquals("", prefix.longestCommonPrefix2(strs));
    }

    @Test
    public void testLongestOneInCommonPrefix() {
        String[] strs = {"r","r","r"};
        Assert.assertEquals("r", prefix.longestCommonPrefix2(strs));
    }

    @Test
    public void testLongestZeroCommonPrefix() {
        String[] strs = {"","r",""};
        Assert.assertEquals("", prefix.longestCommonPrefix2(strs));
    }
}