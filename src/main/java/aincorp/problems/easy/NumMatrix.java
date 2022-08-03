package aincorp.problems.easy;

/**
 * 304. Range Sum Query 2D - Immutable
 * <p>
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
public class NumMatrix {
    private int[][] matrix;

    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int summary = 0;

        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                summary += matrix[i][j];
            }
        }

        return summary;
    }
}
