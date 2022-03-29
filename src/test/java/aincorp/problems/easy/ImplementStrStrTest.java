package aincorp.problems.easy;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled
class ImplementStrStrTest {

    @Test
    public void needle_is_empty() {
        String haystack = "";
        String needle = "";
        ImplementStrStr implementStrStr = new ImplementStrStr();
        assertEquals(0, implementStrStr.strStr(haystack, needle));
    }

    @Test
    public void needle_is_contains_index_on_str() {
        String haystack = "hello";
        String needle = "ll";
        ImplementStrStr implementStrStr = new ImplementStrStr();
        assertEquals(2, implementStrStr.strStr(haystack, needle));
    }

}