package aincorp.problems.easy;

import java.util.Arrays;

public class CellsOddValuesMatrix {

    public int oddCells(int m, int n, int[][] indices) {
        int count = 0;

        int[][] resultMatrix = new int[m][n];

        for (int i = 0; i < indices.length; i++) {
            System.out.println(Arrays.toString(indices[i]));
        }

        return count;
    }

}
