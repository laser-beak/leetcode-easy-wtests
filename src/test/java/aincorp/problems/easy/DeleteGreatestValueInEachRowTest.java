package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeleteGreatestValueInEachRowTest {

    private final DeleteGreatestValueInEachRow deleteGreatestValueInEachRow = new DeleteGreatestValueInEachRow();

    @Test
    void test() {
        assertEquals(10, deleteGreatestValueInEachRow.deleteGreatestValue(new int[][]{{10}}));
        assertEquals(8, deleteGreatestValueInEachRow.deleteGreatestValue(new int[][]{{1, 2, 4}, {3, 3, 1}}));
    }

}