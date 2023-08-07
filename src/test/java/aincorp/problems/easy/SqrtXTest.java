package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SqrtXTest {

    private final SqrtX sqrtX = new SqrtX();

    @Test
    void test() {
        assertEquals(0, sqrtX.mySqrt(0));
        assertEquals(2, sqrtX.mySqrt(4));
        assertEquals(2, sqrtX.mySqrt(8));
        assertEquals(3, sqrtX.mySqrt(9));
        assertEquals(46339, sqrtX.mySqrt(2147395599));
    }
}