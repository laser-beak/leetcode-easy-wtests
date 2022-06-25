package aincorp.problems.easy;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled
public class ConvertArabicToRomanNumberTest {

    private final ConvertNumber convertNumber = new ConvertNumber();

    @Test
    public void convert_1_to_I() {
        assertEquals("I", convertNumber.toRoman(1));
    }

    @Test
    public void convert_2_to_II() {
        assertEquals("II", convertNumber.toRoman(2));
    }

    @Test
    public void convert_3_to_III() {
        assertEquals("III", convertNumber.toRoman(3));
    }

    @Test
    public void convert_5_to_V() {
        assertEquals("V", convertNumber.toRoman(5));
    }

    @Test
    public void convert_6_to_VI() {
        assertEquals("VI", convertNumber.toRoman(6));
    }

    @Test
    public void convert_4_to_IV() {
        assertEquals("IV", convertNumber.toRoman(4));
    }

    @Test
    public void convert_7_to_VII() {
        assertEquals("VII", convertNumber.toRoman(7));
    }

    @Test
    public void convert_10_to_X() {
        assertEquals("X", convertNumber.toRoman(10));
    }

    @Test
    public void convert_9_to_IX() {
        assertEquals("IX", convertNumber.toRoman(9));
    }
}
