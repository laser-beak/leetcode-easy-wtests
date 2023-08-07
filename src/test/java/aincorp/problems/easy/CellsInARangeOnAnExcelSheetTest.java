package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CellsInARangeOnAnExcelSheetTest {

    private CellsInARangeOnAnExcelSheet cells = new CellsInARangeOnAnExcelSheet();

    @Test
    void test() {
        assertEquals(new ArrayList<String>() {
            {
                add("K1");
                add("K2");
                add("L1");
                add("L2");
            }
        }, cells.cellsInRange("K1:L2"));
        assertEquals(new ArrayList<String>() {
            {
                add("A1");
                add("B1");
                add("C1");
                add("D1");
                add("E1");
                add("F1");
            }
        }, cells.cellsInRange("A1:F1"));
    }

}