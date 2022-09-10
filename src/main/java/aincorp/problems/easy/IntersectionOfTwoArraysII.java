package aincorp.problems.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> integerMap = new HashMap<>();

        for (int i : nums1) {
            if (!integerMap.containsKey(i)) {
                integerMap.put(i, 1);
            } else {
                integerMap.put(i, integerMap.get(i) + 1);
            }
        }

        List<Integer> integerList = new ArrayList<>();

        for (int j : nums2) {
            if (integerMap.containsKey(j)) {
                if (integerMap.get(j) > 0) {
                    integerMap.put(j, integerMap.get(j) - 1);
                    integerList.add(j);
                }
            }
        }

        int [] ints = new int[integerList.size()];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = integerList.get(i);
        }

        return ints;
    }
}
