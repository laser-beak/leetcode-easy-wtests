package aincorp.problems.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XOROperationInAnArrayTest {

    XOROperationInAnArray xorOperationInAnArray;

    @DisplayName("XOROperationInAnArray.xorOperation")
    @Test
    void xorOperation() {
        xorOperationInAnArray = new XOROperationInAnArray();

        assertEquals(8, xorOperationInAnArray.xorOperation(5 , 0));
    }

    @Test
    void xorOperationSecond() {
        xorOperationInAnArray = new XOROperationInAnArray();

        assertEquals(8, xorOperationInAnArray.xorOperation(4 , 3));
    }
}