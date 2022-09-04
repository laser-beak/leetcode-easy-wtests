package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleNumberTest {


    private final SingleNumber singleNumber = new SingleNumber();

    @Test
    public void test() {
        assertEquals(1, singleNumber.singleNumber(new int[]{2, 2, 1}));
        assertEquals(4, singleNumber.singleNumber(new int[]{4, 1, 2, 1, 2}));
        assertEquals(1, singleNumber.singleNumber(new int[]{1}));
    }

}