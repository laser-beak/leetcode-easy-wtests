package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowerOfTwoTest {

    private final PowerOfTwo power = new PowerOfTwo();

    @Test
    public void test() {
        assertEquals(false, power.isPowerOfTwo(0));
        assertEquals(true, power.isPowerOfTwo(1));
        assertEquals(true, power.isPowerOfTwo(16));
        assertEquals(false, power.isPowerOfTwo(3));
    }

}