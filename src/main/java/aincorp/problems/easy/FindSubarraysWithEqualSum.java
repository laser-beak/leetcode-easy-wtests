package aincorp.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class FindSubarraysWithEqualSum {

    public boolean findSubarrays(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i] + nums[i + 1];
            if (map.containsKey(sum)) {
                return true;
            }
            map.put(sum, 1);
        }

        return false;
    }
}
