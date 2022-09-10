package aincorp.problems.easy;

public class PowerOfThree {

    public boolean isPowerOfThree(int n) {
        boolean isPowerOfThree = false;

        while (n > 0) {
            if (n == 1) {
                return true;
            }

            if (n % 3 != 0) {
                return false;
            }

            n = n / 3;
        }

        return isPowerOfThree;
    }

}
