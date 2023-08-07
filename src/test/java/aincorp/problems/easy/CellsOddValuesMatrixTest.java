package aincorp.problems.easy;

import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled
class CellsOddValuesMatrixTest {

    private CellsOddValuesMatrix cellsOddValuesMatrix = new CellsOddValuesMatrix();

    @Ignore
    @Test
    void test() {
        assertEquals(6, cellsOddValuesMatrix.oddCells(2, 3, new int[][]{{0, 1}, {1, 1}}));
    }

}