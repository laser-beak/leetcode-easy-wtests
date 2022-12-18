package aincorp.yamock;

public class ReversedIsBiggerThanNumber {

    public boolean compareNumbers(int number) {
        int rev = 0;
        int num = number;

        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }

        return rev > number;
    }
}
