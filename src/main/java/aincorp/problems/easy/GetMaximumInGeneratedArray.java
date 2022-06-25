package aincorp.problems.easy;

public class GetMaximumInGeneratedArray {

    public int getMaximumGenerated(int n) {

        if (n == 0) {
            return 0;
        }
        int[] nums = new int[n + 1];

        int result = 0;

        nums[0] = 0;
        nums[1] = 1;

        int i = 1;
        while (i <= n / 2) {
            nums[i * 2] = nums[i];
            if (i * 2 + 1 <= n) {
                nums[i * 2 + 1] = nums[i] + nums[i + 1];
            }
            i++;
        }

        for (int j = 0; j < nums.length; j++) {
            if (result < nums[j]) {
                result = nums[j];
            }
        }

        return result;
    }
}
