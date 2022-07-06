package aincorp.problems.easy;

public class CountNumberOfPairsWithAbsoluteDifferenceK {

    public int countKDifference(int[] nums, int k) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (k == Math.abs(nums[i] - nums[j])) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
