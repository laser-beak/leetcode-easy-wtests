package aincorp.yamock;

public class ReversedIsBiggerThanNumber {

    public boolean compareNumbers(int number) {
        int c = 0;
        int b = number;

        while (b > 0) {
            c = c * 10 + (b % 10);
            b /= 10;
        }

        return c > number;
    }
}
