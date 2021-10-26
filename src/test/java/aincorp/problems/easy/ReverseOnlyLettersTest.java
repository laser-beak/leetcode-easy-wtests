package aincorp.problems.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ReverseOnlyLettersTest {

    @Test
    public void when_string_to_reverse_empty() {
        ReverseOnlyLetters reverseOnlyLetters = new ReverseOnlyLetters();
        assertEquals("", reverseOnlyLetters.reverseOnlyLetters(""));
    }

    @Test
    public void when_string_not_empty() {
        ReverseOnlyLetters reverseOnlyLetters = new ReverseOnlyLetters();
        assertTrue("dc-ba".equals(reverseOnlyLetters.reverseOnlyLetters("ab-cd")));
    }

    @Test
    public void when_string_not_empty_long_string() {
        ReverseOnlyLetters reverseOnlyLetters = new ReverseOnlyLetters();
        assertTrue("j-Ih-gfE-dCba".equals(reverseOnlyLetters.reverseOnlyLetters("a-bC-dEf-ghIj")));
    }

    @Test
    public void when_string_not_empty_longest_string() {
        ReverseOnlyLetters reverseOnlyLetters = new ReverseOnlyLetters();
        assertTrue("Qedo1ct-eeLg=ntse-T!".equals(reverseOnlyLetters.reverseOnlyLetters("Test1ng-Leet=code-Q!")));
    }

    @Test
    public void when_string_mv() {
        ReverseOnlyLetters reverseOnlyLetters = new ReverseOnlyLetters();
        assertTrue("vm']4".equals(reverseOnlyLetters.reverseOnlyLetters("mv']4")));
    }

    @Test
    public void when_string_du() {
        ReverseOnlyLetters reverseOnlyLetters = new ReverseOnlyLetters();
        assertTrue("sGu?d3#".equals(reverseOnlyLetters.reverseOnlyLetters("duG?s3#")));
    }
}
