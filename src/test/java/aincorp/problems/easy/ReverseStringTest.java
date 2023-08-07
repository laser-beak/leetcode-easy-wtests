package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseStringTest {

    private final ReverseString reverseString = new ReverseString();

    @Test
    void test() {
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'},
                reverseString.reverseString(new char[]{'h', 'e', 'l', 'l', 'o'}));
        assertArrayEquals(new char[]{'H', 'a', 'n', 'n', 'a', 'h'},
                reverseString.reverseString(new char[]{'h', 'a', 'n', 'n', 'a', 'H'}));
    }

}