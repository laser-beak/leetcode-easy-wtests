package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidPalindromeTest {
    private final ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    void test() {
        assertEquals(true, validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        assertEquals(false, validPalindrome.isPalindrome("race a car"));
        assertEquals(true, validPalindrome.isPalindrome("T e, : n E , : t"));
        assertEquals(true, validPalindrome.isPalindrome("a."));
        assertEquals(true, validPalindrome.isPalindrome(""));
        assertEquals(true, validPalindrome.isPalindrome(" "));
        assertEquals(false, validPalindrome.isPalindrome("0P"));
    }
}