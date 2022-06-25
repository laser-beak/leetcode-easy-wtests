package aincorp.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {

        Map<Integer, Boolean> numbersMap = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (!numbersMap.containsKey(nums1[i])) {
                        numbersMap.put(nums1[i], true);
                    }
                }
            }
        }

        int[] intersectNums = new int[numbersMap.keySet().size()];

        int k = 0;
        for (Integer integer : numbersMap.keySet()) {
            intersectNums[k] = integer;
            k++;
        }

        return intersectNums;
    }

}
