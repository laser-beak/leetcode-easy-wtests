package aincorp.problems.easy;

import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled
class AddBinaryTest {

    private final AddBinary addBinary = new AddBinary();

    @Ignore
    @Test
    void test() {
        assertEquals("10101", addBinary.addBinary("1010", "1011"));
        //assertEquals("100", addBinary.addBinary("11", "1"));
        //assertEquals("", addBinary.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }
}