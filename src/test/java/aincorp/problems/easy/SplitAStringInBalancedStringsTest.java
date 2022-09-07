package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SplitAStringInBalancedStringsTest {

    private final SplitAStringInBalancedStrings splitAStringInBalancedStrings = new SplitAStringInBalancedStrings();

    @Test
    public void test() {
        assertEquals(0, splitAStringInBalancedStrings.balancedStringSplit(""));
        assertEquals(1, splitAStringInBalancedStrings.balancedStringSplit("RL"));
        assertEquals(2, splitAStringInBalancedStrings.balancedStringSplit("RLRL"));
    }

}