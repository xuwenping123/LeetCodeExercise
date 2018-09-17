package easy;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {

    private PalindromeNumber pal = new PalindromeNumber();

    @Test
    public void testPalindromeNumber() {
        int x = 121;
        Assert.assertTrue(pal.IsPalindrome2(x));
    }

    @Test
    public void testNotPalindromeNumber() {
        int x = -123;
        Assert.assertFalse(pal.IsPalindrome2(x));
    }

    @Test
    public void testSingleNumber() {
        int x = 1;
        Assert.assertTrue(pal.IsPalindrome2(x));
    }
}
