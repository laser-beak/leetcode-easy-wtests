package aincorp.problems.easy;

import java.util.Arrays;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        int nl = nums.length;

        for (int i = 0; i < nl; i++) {
            if (nums[i] != i) {
                return i;
            }
        }

        return nums[nl - 1] + 1;
    }
}
