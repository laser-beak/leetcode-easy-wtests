package aincorp.problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeleteGreatestValueInEachRow {

    public int deleteGreatestValue(int[][] grid) {
        for (int j = 0; j < grid.length; j++) {
            Arrays.sort(grid[j]);
        }

        for (int col = 0; col < grid[0].length; col++) {
            List<Integer> thisCol = new ArrayList<>();

            for (int i = 0; i < grid.length; i++) {
                thisCol.add(grid[i][col]);
            }

            Collections.sort(thisCol, Collections.reverseOrder());

            for (int i = 0; i < grid.length; i++) {
                grid[i][col] = thisCol.get(i);
            }
        }

        int sum = 0;

        for (int i = 0; i < grid[0].length; i++) {
            sum += grid[0][i];
        }

        return sum;
    }
}
