package aincorp.problems.easy;

public class LargestLocalValuesInAMatrix {
    public int[][] largestLocal(int[][] grid) {
        int[][] maxLocal = new int[grid.length - 2][grid.length - 2];

        for (int i = 0; i < maxLocal.length; i++) {
            for (int j = 0; j < maxLocal.length; j++) {
                maxLocal[i][j] = findMaxLocal(i, j, grid);
            }
        }

        return maxLocal;
    }

    private int findMaxLocal(int i, int j, int[][] grid) {
        int max = 0;

        for (int k = i; k <= i + 2; k++) {
            for (int l = j; l <= j + 2; l++) {
                if (max < grid[k][l]) {
                    max = grid[k][l];
                }
            }
        }

        return max;
    }

}
