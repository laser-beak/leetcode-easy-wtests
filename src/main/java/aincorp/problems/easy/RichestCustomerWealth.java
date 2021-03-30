package aincorp.problems.easy;

public class RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        int max = 0;

        for (int row = 0; row < accounts.length; row++) {
            for (int col = 0; col < accounts[row].length; col++) {
                sum += accounts[row][col];
            }
            if (max < sum) {
                max = sum;
            }
            sum = 0;
        }

        return max;
    }
}
