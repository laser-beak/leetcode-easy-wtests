package aincorp.problems.easy;

public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        if (n % 2 > 0) {
            return false;
        }

        n /= 2;

        return isPowerOfTwo(n);
    }
}
