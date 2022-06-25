package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZeroesTest {
    private final MoveZeroes moveZeroes = new MoveZeroes();

    @Test
    public void test() {
        assertArrayEquals(new int[]{0}, moveZeroes.moveZeroes(new int[]{0}));
        assertArrayEquals(new int[]{1, 0}, moveZeroes.moveZeroes(new int[]{0, 1}));
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, moveZeroes.moveZeroes(new int[]{0, 1, 0, 3, 12}));
        assertArrayEquals(new int[]{1, 0, 0}, moveZeroes.moveZeroes(new int[]{0, 0, 1}));
    }

}