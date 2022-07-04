package aincorp.problems.easy;

public class FlippingAnImage {

    public int[][] flipAndInvertImage(int[][] image) {
        int[][] result = new int[image.length][image.length];

        for (int i = 0; i < image.length; i++) {
            int row[] = image[i];
            for (int j = 0; j < row.length; j++) {
                result[i][j] = row[row.length - j - 1];
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                } else {
                    result[i][j] = 0;
                }
            }
        }

        return result;
    }
}
