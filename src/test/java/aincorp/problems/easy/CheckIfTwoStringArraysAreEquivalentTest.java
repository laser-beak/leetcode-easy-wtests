package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckIfTwoStringArraysAreEquivalentTest {

    private final CheckIfTwoStringArraysAreEquivalent check = new CheckIfTwoStringArraysAreEquivalent();

    @Test
    void test() {
        assertEquals(true, check.arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));
        assertEquals(false, check.arrayStringsAreEqual(new String[]{"a", "cb"}, new String[]{"ab", "c"}));
        assertEquals(true, check.arrayStringsAreEqual(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"}));
    }

}