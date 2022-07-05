package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DecodeXORedArrayTest {

    private DecodeXORedArray decodeXORedArray = new DecodeXORedArray();

    @Test
    public void test() {
        assertArrayEquals(new int[]{1, 0, 2, 1}, decodeXORedArray.decode(new int[]{1, 2, 3}, 1));
        assertArrayEquals(new int[]{4, 2, 0, 7, 4}, decodeXORedArray.decode(new int[]{6, 2, 7, 3}, 4));
    }

}