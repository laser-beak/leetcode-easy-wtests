package aincorp.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        int value = nums.length / 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        int max = 0;

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() > value) {
                if (m.getKey() > max) {
                    max = m.getKey();
                }
            }
        }

        return max;
    }
}
