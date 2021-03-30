package aincorp.problems.easy;

public class SubtractProductAndSumOfDigitsOfAnInteger {

    public int subtractProductAndSum(int n) {
        int productsOfDigits = 1;
        int sumOfDigits = 0;

        while (n > 0) {
            sumOfDigits += n % 10;
            productsOfDigits *= n % 10;
            n /= 10;
        }

        return productsOfDigits - sumOfDigits;
    }
}
