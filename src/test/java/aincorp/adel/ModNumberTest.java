package aincorp.adel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ModNumberTest {

    private ModNumber modNumber = new ModNumber();

    @Test
    void test() {
        assertEquals(2, modNumber.modNumber(new int[]{1, 3, 3, 1}));
        assertEquals(3, modNumber.modNumber(new int[]{1, 2, 3, 4, 4, 4, 3}));
    }

}