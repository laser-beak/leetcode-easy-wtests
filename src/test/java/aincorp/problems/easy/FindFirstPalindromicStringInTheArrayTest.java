package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindFirstPalindromicStringInTheArrayTest {

    private final FindFirstPalindromicStringInTheArray find = new FindFirstPalindromicStringInTheArray();

    @Test
    void test() {
        assertEquals("", find.firstPalindrome(new String[]{}));
        assertEquals("ada", find.firstPalindrome(new String[]{"abc", "car", "ada", "racecar", "cool"}));
        assertEquals("racecar", find.firstPalindrome(new String[]{"notapalindrome", "racecar"}));
        assertEquals("", find.firstPalindrome(new String[]{"def", "ghi"}));
    }

}