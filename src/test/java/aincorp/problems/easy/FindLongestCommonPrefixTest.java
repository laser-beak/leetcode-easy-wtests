package aincorp.problems.easy;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

@Disabled
class FindLongestCommonPrefixTest {
    private final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    public void find_fl_on_strs() {
        assertEquals("fl", longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    @Test
    public void find_dog_on_strs() {
        assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

    @Test
    public void find_zerostrs_on_strs() {
        assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{}));
    }

    @Test
    public void find_a_strs_on_strs() {
        assertEquals("a", longestCommonPrefix.longestCommonPrefix(new String[]{"a"}));
    }

    @Test
    public void find_flower_strs_on_strs() {
        assertEquals("flower", longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flower", "flower", "flower"}));
    }

    @Test
    public void find_aa_strs_on_strs() {
        assertEquals("aa", longestCommonPrefix.longestCommonPrefix(new String[]{"aa", "aa"}));
    }

    @Test
    public void find_aa_on_aaa_strs_on_strs() {
        assertEquals("aa", longestCommonPrefix.longestCommonPrefix(new String[]{"aaa", "aa", "aaa"}));
    }

    @Test
    public void find_с_strs_on_strs() {
        assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"с", "aсс", "сcc"}));
    }

    @Test
    public void find_ab_strs_on_strs() {
        assertEquals("a", longestCommonPrefix.longestCommonPrefix(new String[]{"ab", "a"}));
    }
}