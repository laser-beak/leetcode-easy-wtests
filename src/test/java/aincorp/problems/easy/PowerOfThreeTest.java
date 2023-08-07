package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PowerOfThreeTest {

    private final PowerOfThree powerOfThree = new PowerOfThree();

    @Test
    void test() {
        assertFalse(powerOfThree.isPowerOfThree(0));
        assertTrue(powerOfThree.isPowerOfThree(27));
        assertFalse(powerOfThree.isPowerOfThree(-1));
        assertFalse(powerOfThree.isPowerOfThree(28));
        assertFalse(powerOfThree.isPowerOfThree(91));
        assertFalse(powerOfThree.isPowerOfThree(30));
    }

}