package aincorp.problems.easy;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashSum = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (hashSum.containsKey(diff)) {
                int[] ans = new int[]{diff, nums[i]};
                return ans;
            }
            hashSum.put(nums[i], diff);
        }
        return new int[]{};
    }
}
