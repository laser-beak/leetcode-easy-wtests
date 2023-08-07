package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemovePalindromicSubsequencesTest {
    private RemovePalindromicSubsequences palindromicSubsequences = new RemovePalindromicSubsequences();

    @Test
    void s_is_palindrome() {
        assertEquals(1, palindromicSubsequences.removePalindromeSub("ababa"));
    }

    @Test
    void s_is_one_Symbol() {
        assertEquals(1, palindromicSubsequences.removePalindromeSub("a"));
    }

    @Test
    void s_has_two_palindrome() {
        assertEquals(2, palindromicSubsequences.removePalindromeSub("abb"));
    }

    @Test
    void s_has_palindrome_answer_two() {
        assertEquals(2, palindromicSubsequences.removePalindromeSub("baabb"));
    }
}