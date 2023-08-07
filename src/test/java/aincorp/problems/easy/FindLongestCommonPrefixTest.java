package aincorp.problems.easy;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

@Disabled
class FindLongestCommonPrefixTest {
    private final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    void find_fl_on_strs() {
        assertEquals("fl", longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    @Test
    void find_dog_on_strs() {
        assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

    @Test
    void find_zerostrs_on_strs() {
        assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{}));
    }

    @Test
    void find_a_strs_on_strs() {
        assertEquals("a", longestCommonPrefix.longestCommonPrefix(new String[]{"a"}));
    }

    @Test
    void find_flower_strs_on_strs() {
        assertEquals("flower", longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flower", "flower", "flower"}));
    }

    @Test
    void find_aa_strs_on_strs() {
        assertEquals("aa", longestCommonPrefix.longestCommonPrefix(new String[]{"aa", "aa"}));
    }

    @Test
    void find_aa_on_aaa_strs_on_strs() {
        assertEquals("aa", longestCommonPrefix.longestCommonPrefix(new String[]{"aaa", "aa", "aaa"}));
    }

    @Test
    void find_с_strs_on_strs() {
        assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"с", "aсс", "сcc"}));
    }

    @Test
    void find_ab_strs_on_strs() {
        assertEquals("a", longestCommonPrefix.longestCommonPrefix(new String[]{"ab", "a"}));
    }
}