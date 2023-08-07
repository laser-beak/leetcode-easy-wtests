package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingNumberTest {

    private final MissingNumber missingNumber = new MissingNumber();

    @Test
    void test() {
        assertEquals(2, missingNumber.missingNumber(new int[]{3, 0, 1}));
        assertEquals(2, missingNumber.missingNumber(new int[]{0, 1}));
        assertEquals(8, missingNumber.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }

}