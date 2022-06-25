package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhenConvertRomanToIntegerTest {

    private final ConvertRomanNumber convertRomanNumber = new ConvertRomanNumber();

    @Test
    public void convert_I_to_1() {
        assertEquals(1, convertRomanNumber.toArabicNumber("I"));
    }

    @Test
    public void convert_II_to_2() {
        assertEquals(2, convertRomanNumber.toArabicNumber("II"));
    }

    @Test
    public void convert_III_to_3() {
        assertEquals(3, convertRomanNumber.toArabicNumber("III"));
    }

    @Test
    public void convert_IV_to_4() {
        assertEquals(4, convertRomanNumber.toArabicNumber("IV"));
    }

    @Test
    public void convert_V_to_5() {
        assertEquals(5, convertRomanNumber.toArabicNumber("V"));
    }

    @Test
    public void convert_VI_to_6() {
        assertEquals(6, convertRomanNumber.toArabicNumber("VI"));
    }

    @Test
    public void convert_VII_to_7() {
        assertEquals(7, convertRomanNumber.toArabicNumber("VII"));
    }

    @Test
    public void convert_VIII_to_8() {
        assertEquals(8, convertRomanNumber.toArabicNumber("VIII"));
    }

    @Test
    public void convert_IX_to_9() {
        assertEquals(9, convertRomanNumber.toArabicNumber("IX"));
    }

    @Test
    public void convert_X_to_10() {
        assertEquals(10, convertRomanNumber.toArabicNumber("X"));
    }

    @Test
    public void convert_XI_to_11() {
        assertEquals(11, convertRomanNumber.toArabicNumber("XI"));
    }

    @Test
    public void convert_XII_to_12() {
        assertEquals(12, convertRomanNumber.toArabicNumber("XII"));
    }

    @Test
    public void convert_XIX_to_19() {
        assertEquals(19, convertRomanNumber.toArabicNumber("XIX"));
    }

    @Test
    public void convert_LVIII_to_58() {
        assertEquals(58, convertRomanNumber.toArabicNumber("LVIII"));
    }

    @Test
    public void convert_MCMXCIV_to_1994() {
        assertEquals(1994, convertRomanNumber.toArabicNumber("MCMXCIV"));
    }

    @Test
    public void convert_DCXXI_to_621() {
        assertEquals(621, convertRomanNumber.toArabicNumber("DCXXI"));
    }
}
