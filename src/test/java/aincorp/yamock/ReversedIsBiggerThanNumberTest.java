package aincorp.yamock;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ReversedIsBiggerThanNumberTest {

    private final ReversedIsBiggerThanNumber reversedIsBiggerThanNumber = new ReversedIsBiggerThanNumber();

    @Test
    public void test() {
        assertTrue(reversedIsBiggerThanNumber.compareNumbers(14));
        assertTrue(reversedIsBiggerThanNumber.compareNumbers(44));
        assertTrue(reversedIsBiggerThanNumber.compareNumbers(401));
        assertFalse(reversedIsBiggerThanNumber.compareNumbers(105));
    }

}