package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SplitAStringInBalancedStringsTest {
    private final SplitAStringInBalancedStrings splitAStringInBalancedStrings = new SplitAStringInBalancedStrings();

    @Test
    void test() {
        assertEquals(0, splitAStringInBalancedStrings.balancedStringSplit(""));
        assertEquals(1, splitAStringInBalancedStrings.balancedStringSplit("RL"));
        assertEquals(2, splitAStringInBalancedStrings.balancedStringSplit("RLRL"));
        assertEquals(2, splitAStringInBalancedStrings.balancedStringSplit("LRLR"));
        assertEquals(4, splitAStringInBalancedStrings.balancedStringSplit("RLRRLLRLRL"));
        assertEquals(1, splitAStringInBalancedStrings.balancedStringSplit("LLLLRRRR"));
        assertEquals(2, splitAStringInBalancedStrings.balancedStringSplit("RLRRRLLRLL"));
    }
}