package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {
    private final LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    void when_s_is_empty_result_zero() {
        assertEquals(0, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(""));
    }

    @Test
    void when_s_is_Empty_result_one() {
        assertEquals(1, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(" "));
    }

    @Test
    void when_s_bbbb_result_one() {
        assertEquals(1, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void when_s_abcabcbb_result_three() {
        assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void when_s_pwwkew_result_three() {
        assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void when_s_au_result_two() {
        assertEquals(2, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("au"));
    }
}