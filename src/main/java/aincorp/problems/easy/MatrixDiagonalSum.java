package aincorp.problems.easy;

public class MatrixDiagonalSum {

    public int diagonalSum(int[][] mat) {

        int result = 0;

        for (int i = 0; i < mat.length; i++) {
            result += mat[i][i];
        }

        int n = mat.length - 1;
        for (int j = 0; j < mat.length; j++) {
            if (j != n) {
                result += mat[j][n];
            }
            n--;
        }

        return result;
    }
}
