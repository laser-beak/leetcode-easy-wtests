package aincorp.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {

    public int sumOfUnique(int[] nums) {
        int sum = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 0);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (map.get(entry.getKey()) == 0) {
                sum += entry.getKey();
            }
        }

        return sum;
    }

        /* int sum = 0;

        int a[] = new int[101];

        for (int i = 0; i < nums.length; i++) {
            a[nums[i]]++;
        }

        for (int i : nums) {
            if (a[i] == 1) {
                sum+=i;
            }
        }

        return sum;*/
}
