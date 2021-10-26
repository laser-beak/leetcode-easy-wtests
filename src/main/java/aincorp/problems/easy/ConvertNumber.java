package aincorp.problems.easy;

import java.util.ArrayList;

public class ConvertNumber {

    public String toRoman(int arabicNumber) {
        String romanNumber = getRomanNumber(arabicNumber);
        romanNumber = romanNumber.replace("IIII", "IV");
        return romanNumber;
    }

    private static String getRomanNumber(int arabicNumber) {
        StringBuilder romanNumber = new StringBuilder();

        ArrayList<PairOfDigits> digits = new ArrayList<>();
        digits.add(new PairOfDigits(10, 'X'));
        digits.add(new PairOfDigits(5, 'V'));
        digits.add(new PairOfDigits(1, 'I'));

        for (PairOfDigits digit : digits) {
            while (arabicNumber >= digit.getArabic()) {
                romanNumber.append(digit.getRoman());
                arabicNumber -= digit.getArabic();
            }
        }

        return romanNumber.toString();
    }
}
