package aincorp.problems.easy;

public class TransposeMatrix {

    public int[][] transpose(int[][] matrix) {
        int colLength = matrix[0].length;
        int rowLength = matrix.length;

        int[][] result = new int[colLength][rowLength];

        for (int i = 0; i < rowLength; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < colLength; j++) {
                result[j][i] = row[j];
            }
        }

        return result;
    }
}
