package aincorp.problems.easy;

public class RunningSumOf1dArray {

    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];

        int i = 0;

        while (i < nums.length) {
            int summary = 0;
            for (int j = 0; j <= i; j++) {
                summary += nums[j];
            }
            result[i] = summary;
            i++;
        }

        return result;
    }
}
