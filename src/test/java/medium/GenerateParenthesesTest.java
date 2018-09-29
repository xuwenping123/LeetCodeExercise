package medium;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class GenerateParenthesesTest {

    private GenerateParentheses parentheses;

    @Before
    public void setUp() {
        parentheses = new GenerateParentheses();
    }

    @Test
    public void generateParenthesis() {
        int n = 3;
        System.out.println(System.currentTimeMillis());
        List<String> list = parentheses.generateParenthesis(n);
        System.out.println(System.currentTimeMillis());
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(Math.pow(n * 2, n * 2));
    }
}