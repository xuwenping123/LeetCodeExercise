package medium;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalSubStringTest {

    private LongestPalSubString substring = new LongestPalSubString();


    @Test
    public void  testNumString() {
        String str = null;
        Assert.assertEquals(null, substring.longestPalindrome(str));
    }

    @Test
    public void  testEmptyString() {
        String str = "";
        Assert.assertEquals("", substring.longestPalindrome(str));
    }

    @Test
    public void  testOneString() {
        String str = "a";
        Assert.assertEquals("a", substring.longestPalindrome(str));
    }

    @Test
    public void  testTwoString() {
        String str = "ab";
        Assert.assertEquals("a", substring.longestPalindrome(str));
    }

    @Test
    public void  testTwoSameString() {
        String str = "aa";
        Assert.assertEquals("aa", substring.longestPalindrome(str));
    }

    @Test
    public void  testThreeDifString() {
        String str = "aba";
        Assert.assertEquals("aba", substring.longestPalindrome(str));
    }

    @Test
    public void  testThreeSameString() {
        String str = "aaa";
        Assert.assertEquals("aaa", substring.longestPalindrome(str));
    }

    @Test
    public void  testThreeYesString() {
        String str = "abb";
        Assert.assertEquals("bb", substring.longestPalindrome(str));
    }

    @Test
    public void  testThreeNotString() {
        String str = "abc";
        Assert.assertEquals("a", substring.longestPalindrome(str));
    }
}