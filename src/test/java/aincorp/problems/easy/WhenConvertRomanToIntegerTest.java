package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhenConvertRomanToIntegerTest {

    @Test
    public void convert_I_to_1() {
        int arabicNumber = new ConvertRomanNumber().toArabicNumber("I");
        assertEquals(1, arabicNumber);
    }

    @Test
    public void convert_II_to_2() {
        int arabicNumber = new ConvertRomanNumber().toArabicNumber("II");
        assertEquals(2, arabicNumber);
    }

    @Test
    public void convert_III_to_3() {
        int arabicNumber = new ConvertRomanNumber().toArabicNumber("III");
        assertEquals(3, arabicNumber);
    }

    @Test
    public void convert_IV_to_4() {
        int arabicNumber = new ConvertRomanNumber().toArabicNumber("IV");
        assertEquals(4, arabicNumber);
    }

    @Test
    public void convert_V_to_5() {
        int arabicNumber = new ConvertRomanNumber().toArabicNumber("V");
        assertEquals(5, arabicNumber);
    }

    @Test
    public void convert_VI_to_6() {
        int arabicNumber = new ConvertRomanNumber().toArabicNumber("VI");
        assertEquals(6, arabicNumber);
    }

    @Test
    public void convert_VII_to_7() {
        int arabicNumber = new ConvertRomanNumber().toArabicNumber("VII");
        assertEquals(7, arabicNumber);
    }

    @Test
    public void convert_VIII_to_8() {
        int arabicNumber = new ConvertRomanNumber().toArabicNumber("VIII");
        assertEquals(8, arabicNumber);
    }

    @Test
    public void convert_IX_to_9() {
        int arabicNumber = new ConvertRomanNumber().toArabicNumber("IX");
        assertEquals(9, arabicNumber);
    }

    @Test
    public void convert_X_to_10() {
        int arabicNumber = new ConvertRomanNumber().toArabicNumber("X");
        assertEquals(10, arabicNumber);
    }

    @Test
    public void convert_XI_to_11() {
        int arabicNumber = new ConvertRomanNumber().toArabicNumber("XI");
        assertEquals(11, arabicNumber);
    }

    @Test
    public void convert_XII_to_12() {
        int arabicNumber = new ConvertRomanNumber().toArabicNumber("XII");
        assertEquals(12, arabicNumber);
    }

    @Test
    public void convert_XIX_to_19() {
        int arabicNumber = new ConvertRomanNumber().toArabicNumber("XIX");
        assertEquals(19, arabicNumber);
    }

    @Test
    public void convert_LVIII_to_58() {
        int arabicNumber = new ConvertRomanNumber().toArabicNumber("LVIII");
        assertEquals(58, arabicNumber);
    }

    @Test
    public void convert_MCMXCIV_to_1994() {
        int arabicNumber = new ConvertRomanNumber().toArabicNumber("MCMXCIV");
        assertEquals(1994, arabicNumber);
    }

    @Test
    public void convert_DCXXI_to_621() {
        int arabicNumber = new ConvertRomanNumber().toArabicNumber("DCXXI");
        assertEquals(621, arabicNumber);
    }
}
