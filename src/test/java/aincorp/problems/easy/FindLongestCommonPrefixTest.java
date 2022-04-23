package aincorp.problems.easy;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindLongestCommonPrefixTest {

    //@Test
    public void find_fl_on_strs(){
        String result = new LongestCommonPrefix().longestCommonPrefix(new String[]{"flower","flow","flight"});
        assertEquals("fl", result);
    }

    //@Test
    public void find_dog_on_strs(){
        String result = new LongestCommonPrefix().longestCommonPrefix(new String[]{"dog","racecar","car"});
        assertEquals("", result);
    }

    //@Test
    public void find_zerostrs_on_strs(){
        String result = new LongestCommonPrefix().longestCommonPrefix(new String[]{});
        assertEquals("", result);
    }

    //@Test
    public void find_a_strs_on_strs(){
        String result = new LongestCommonPrefix().longestCommonPrefix(new String[]{"a"});
        assertEquals("a", result);
    }

    //@Test
    public void find_flower_strs_on_strs(){
        String result = new LongestCommonPrefix().longestCommonPrefix(new String[]{"flower","flower","flower","flower"});
        assertEquals("flower", result);
    }

    //@Test
    public void find_aa_strs_on_strs(){
        String result = new LongestCommonPrefix().longestCommonPrefix(new String[]{"aa","aa"});
        assertEquals("aa", result);
    }

    //@Test
    public void find_aa_on_aaa_strs_on_strs(){
        String result = new LongestCommonPrefix().longestCommonPrefix(new String[]{"aaa","aa", "aaa"});
        assertEquals("aa", result);
    }

    @Test
    public void find_с_strs_on_strs(){
        String result = new LongestCommonPrefix().longestCommonPrefix(new String[]{"с","aсс", "сcc"});
        assertEquals("", result);
    }

    //@Test
    public void find_ab_strs_on_strs(){
        String result = new LongestCommonPrefix().longestCommonPrefix(new String[]{"ab","a"});
        assertEquals("a", result);
    }

}