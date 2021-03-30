package aincorp.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class ConvertRomanNumber {
    public int toArabicNumber(String romanNumber) {
        int arabicNumber = 0;

        Map<Character, Integer> digitsMap = new HashMap<>();
        digitsMap.put('I', 1);
        digitsMap.put('V', 5);
        digitsMap.put('X', 10);
        digitsMap.put('L', 50);
        digitsMap.put('C', 100);
        digitsMap.put('D', 500);
        digitsMap.put('M', 1000);

        char[] chars = romanNumber.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if ( i + 1 < chars.length && digitsMap.get(chars[i + 1]) > digitsMap.get(chars[i])) {
                arabicNumber = arabicNumber + digitsMap.get(chars[i + 1]) - digitsMap.get(chars[i]);
                i++;
            } else {
                arabicNumber += digitsMap.get(chars[i]);
            }
        }

        return arabicNumber;
    }
}
