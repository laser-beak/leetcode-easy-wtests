package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNestingDepthOfTheParenthesesTest {

    private final MaximumNestingDepthOfTheParentheses max = new MaximumNestingDepthOfTheParentheses();

    @Test
    void test () {
        assertEquals(3, max.maxDepth("8*((1*(5+6))*(8/6))"));
    }
}