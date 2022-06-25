package aincorp.problems.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class XOROperationInAnArrayTest {
    private final XOROperationInAnArray xorOperationInAnArray = new XOROperationInAnArray();

    @DisplayName("XOROperationInAnArray.xorOperation")
    @Test
    void xorOperation() {
        assertEquals(8, xorOperationInAnArray.xorOperation(5, 0));
    }

    @Test
    void xorOperationSecond() {
        assertEquals(8, xorOperationInAnArray.xorOperation(4, 3));
    }
}