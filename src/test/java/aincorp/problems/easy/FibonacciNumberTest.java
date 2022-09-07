package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciNumberTest {

    private final FibonacciNumber fibonacciNumber = new FibonacciNumber();

    @Test
    public void test() {
        assertEquals(1, fibonacciNumber.fib(2));
        assertEquals(2, fibonacciNumber.fib(3));
        assertEquals(3, fibonacciNumber.fib(4));
        assertEquals(1, fibonacciNumber.fib(1));
    }

}