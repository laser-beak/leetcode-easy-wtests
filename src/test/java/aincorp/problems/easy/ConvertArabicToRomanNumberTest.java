package aincorp.problems.easy;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled
public class ConvertArabicToRomanNumberTest {
    private final ConvertNumber convertNumber = new ConvertNumber();

    @Test
    public void test() {
        assertEquals("I", convertNumber.toRoman(1));
        assertEquals("II", convertNumber.toRoman(2));
        assertEquals("III", convertNumber.toRoman(3));
        assertEquals("V", convertNumber.toRoman(5));
        assertEquals("VI", convertNumber.toRoman(6));
        assertEquals("IV", convertNumber.toRoman(4));
        assertEquals("VII", convertNumber.toRoman(7));
        assertEquals("X", convertNumber.toRoman(10));
        assertEquals("IX", convertNumber.toRoman(9));
    }
}
