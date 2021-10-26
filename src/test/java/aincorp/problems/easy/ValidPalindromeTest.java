package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    public void whenStringIsValidPalindrome() {
        ValidPalindrome validPalindrome = new ValidPalindrome();

        assertEquals(true, validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void whenStringIsNotValidPalindrome() {
        ValidPalindrome validPalindrome = new ValidPalindrome();

        assertEquals(false, validPalindrome.isPalindrome("race a car"));
    }

    @Test
    public void whenStringIsValidPalindromeEqualsTrue() {
        ValidPalindrome validPalindrome = new ValidPalindrome();

        assertEquals(true, validPalindrome.isPalindrome("T e, : n E , : t"));
    }

    @Test
    public void whenStringIsValidPalindromeEqualsTrueADot() {
        ValidPalindrome validPalindrome = new ValidPalindrome();

        assertEquals(true, validPalindrome.isPalindrome("a."));
    }

    @Test
    public void whenStringSizeZeroValid() {
        ValidPalindrome validPalindrome = new ValidPalindrome();

        assertEquals(true, validPalindrome.isPalindrome(""));
    }

    @Test
    public void whenStringIsEmptyValid() {
        ValidPalindrome validPalindrome = new ValidPalindrome();

        assertEquals(true, validPalindrome.isPalindrome(" "));
    }

    @Test
    public void whenStringCharactersAndNumbersNotValid() {
        ValidPalindrome validPalindrome = new ValidPalindrome();

        assertEquals(false, validPalindrome.isPalindrome("0P"));
    }

}