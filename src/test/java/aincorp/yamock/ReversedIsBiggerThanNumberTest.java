package aincorp.yamock;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ReversedIsBiggerThanNumberTest {

    private final ReversedIsBiggerThanNumber reversedIsBiggerThanNumber = new ReversedIsBiggerThanNumber();

    @Test
    public void test() {
        assertTrue(reversedIsBiggerThanNumber.compareNumbers(14));
        assertFalse(reversedIsBiggerThanNumber.compareNumbers(44));
        assertFalse(reversedIsBiggerThanNumber.compareNumbers(401));
        assertTrue(reversedIsBiggerThanNumber.compareNumbers(105));
        assertFalse(reversedIsBiggerThanNumber.compareNumbers(1001));
    }

}