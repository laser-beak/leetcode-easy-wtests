package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidPalindromeTest {
    private final ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    public void whenStringIsValidPalindrome() {
        assertEquals(true, validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void whenStringIsNotValidPalindrome() {
        assertEquals(false, validPalindrome.isPalindrome("race a car"));
    }

    @Test
    public void whenStringIsValidPalindromeEqualsTrue() {
        assertEquals(true, validPalindrome.isPalindrome("T e, : n E , : t"));
    }

    @Test
    public void whenStringIsValidPalindromeEqualsTrueADot() {
        assertEquals(true, validPalindrome.isPalindrome("a."));
    }

    @Test
    public void whenStringSizeZeroValid() {
        assertEquals(true, validPalindrome.isPalindrome(""));
    }

    @Test
    public void whenStringIsEmptyValid() {
        assertEquals(true, validPalindrome.isPalindrome(" "));
    }

    @Test
    public void whenStringCharactersAndNumbersNotValid() {
        assertEquals(false, validPalindrome.isPalindrome("0P"));
    }
}