package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertRomanToIntegerTest {

    private final ConvertRomanNumber convertRomanNumber = new ConvertRomanNumber();

    @Test
    public void test() {
        assertEquals(1, convertRomanNumber.toArabicNumber("I"));
        assertEquals(2, convertRomanNumber.toArabicNumber("II"));
        assertEquals(3, convertRomanNumber.toArabicNumber("III"));
        assertEquals(4, convertRomanNumber.toArabicNumber("IV"));
        assertEquals(5, convertRomanNumber.toArabicNumber("V"));
        assertEquals(6, convertRomanNumber.toArabicNumber("VI"));
        assertEquals(7, convertRomanNumber.toArabicNumber("VII"));
        assertEquals(8, convertRomanNumber.toArabicNumber("VIII"));
        assertEquals(9, convertRomanNumber.toArabicNumber("IX"));
        assertEquals(10, convertRomanNumber.toArabicNumber("X"));
        assertEquals(11, convertRomanNumber.toArabicNumber("XI"));
        assertEquals(12, convertRomanNumber.toArabicNumber("XII"));
        assertEquals(19, convertRomanNumber.toArabicNumber("XIX"));
        assertEquals(58, convertRomanNumber.toArabicNumber("LVIII"));
        assertEquals(1994, convertRomanNumber.toArabicNumber("MCMXCIV"));
        assertEquals(621, convertRomanNumber.toArabicNumber("DCXXI"));
    }
}
