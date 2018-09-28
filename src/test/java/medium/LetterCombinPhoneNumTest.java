package medium;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LetterCombinPhoneNumTest {

    private LetterCombinPhoneNum run;

    @Before
    public void setUp() throws Exception {
        run = new LetterCombinPhoneNum();
    }

    @Test
    public void letterCombinations() {
        String digits = "23";
        List<String> strs = run.letterCombinations(digits);
        System.out.println(strs);
    }
}