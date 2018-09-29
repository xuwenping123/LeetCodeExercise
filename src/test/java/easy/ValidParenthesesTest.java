package easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidParenthesesTest {

    private ValidParentheses validParentheses;

    @Before
    public void setUp() {
        validParentheses = new ValidParentheses();
    }

    @Test
    public void isValid() {
        String s = "()";
        Assert.assertTrue(validParentheses.isValid(s));
    }

    @Test
    public void isValid2() {
        String s = "(()[])";
        Assert.assertTrue(validParentheses.isValid(s));
    }
}