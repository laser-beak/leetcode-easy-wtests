package aincorp.yamock;

public class ReversedIsBiggerThanNumber {

    public boolean compareNumbers(Integer number) {
        Integer reversed = 1;

        while (number > 1) {
            reversed *= (number % 10) * 10;
            reversed += number / 10;
            number /= 10;
        }

        return reversed > number;
    }
}
