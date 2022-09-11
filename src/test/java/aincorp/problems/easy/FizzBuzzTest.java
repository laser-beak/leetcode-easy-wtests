package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void test_first() {
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("Fizz");

        assertTrue(stringList.equals(fizzBuzz.fizzBuzz(3)));
    }

    @Test
    public void test_second() {
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("Fizz");
        stringList.add("4");
        stringList.add("Buzz");

        assertTrue(stringList.equals(fizzBuzz.fizzBuzz(5)));
    }

    @Test
    public void test_third() {
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("Fizz");
        stringList.add("4");
        stringList.add("Buzz");
        stringList.add("Fizz");
        stringList.add("7");
        stringList.add("8");
        stringList.add("Fizz");
        stringList.add("Buzz");

        stringList.add("11");
        stringList.add("Fizz");
        stringList.add("13");
        stringList.add("14");
        stringList.add("FizzBuzz");

        assertTrue(stringList.equals(fizzBuzz.fizzBuzz(15)));
    }

}