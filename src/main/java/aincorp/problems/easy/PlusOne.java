package aincorp.problems.easy;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int one = 1;
        int dLength = digits.length;
        for (int i = dLength; i > 0; i--) {
            if ((digits[i - 1] + one) % 10 == 0) {
                digits[i - 1] = 0;
            } else {
                digits[i - 1]++;
                one = 0;
                break;
            }
        }

        if (one > 0) {
            int[] plusOne = new int[dLength + 1];
            for (int i = dLength - 1; i > 0; i--) {
                plusOne[i] = digits[i];
            }
            plusOne[0] = one;
            return plusOne;
        } else {
            return digits;
        }
    }
}
