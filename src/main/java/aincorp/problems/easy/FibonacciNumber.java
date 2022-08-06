package aincorp.problems.easy;

public class FibonacciNumber {

    public int fib(int n) {
        int sum = 0;

        int i = 0;
        int ii = 1;

        if (n == 1) {
            return 1;
        }

        while (n > 1) {
            sum = i + ii;
            i = ii;
            ii = sum;
            n--;
        }

        return sum;
    }
}
