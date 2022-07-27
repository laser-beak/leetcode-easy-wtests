package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PowerOfTwoTest {

    private final PowerOfTwo power = new PowerOfTwo();

    @Test
    public void test() {
        assertFalse(power.isPowerOfTwo(0));
        assertTrue(power.isPowerOfTwo(1));
        assertTrue(power.isPowerOfTwo(16));
        assertFalse(power.isPowerOfTwo(3));
    }

}