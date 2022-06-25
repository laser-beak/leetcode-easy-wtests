package aincorp.problems.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class XOROperationInAnArrayTest {
    private final XOROperationInAnArray xorOperationInAnArray = new XOROperationInAnArray();

    @DisplayName("XOROperationInAnArray.xorOperation")
    @Test
    void test() {
        assertEquals(8, xorOperationInAnArray.xorOperation(5, 0));
        assertEquals(8, xorOperationInAnArray.xorOperation(4, 3));
    }
}