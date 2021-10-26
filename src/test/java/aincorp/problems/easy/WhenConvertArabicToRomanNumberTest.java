package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhenConvertArabicToRomanNumberTest {

    @Test
    public void convert_1_to_I() {
        String romanNumber = new ConvertNumber().toRoman(1);
        assertEquals("I", romanNumber);
    }

    @Test
    public void convert_2_to_II() {
        String romanNumber = new ConvertNumber().toRoman(2);
        assertEquals("II", romanNumber);
    }

    @Test
    public void convert_3_to_III() {
        String romanNumber = new ConvertNumber().toRoman(3);
        assertEquals("III", romanNumber);
    }

    @Test
    public void convert_5_to_V() {
        String romanNumber = new ConvertNumber().toRoman(5);
        assertEquals("V", romanNumber);
    }

    @Test
    public void convert_6_to_VI() {
        String romanNumber = new ConvertNumber().toRoman(6);
        assertEquals("VI", romanNumber);
    }

    @Test
    public void convert_4_to_IV() {
        String romanNumber = new ConvertNumber().toRoman(4);
        assertEquals("IV", romanNumber);
    }

    @Test
    public void convert_7_to_VII() {
        String romanNumber = new ConvertNumber().toRoman(7);
        assertEquals("VII", romanNumber);
    }

    @Test
    public void convert_10_to_X() {
        String romanNumber = new ConvertNumber().toRoman(10);
        assertEquals("X", romanNumber);
    }


    /*@Test
    public void convert_9_to_IX() {
        String romanNumber = new ConvertNumber().toRoman(9);
        assertEquals("IX", romanNumber);
    }*/
}
