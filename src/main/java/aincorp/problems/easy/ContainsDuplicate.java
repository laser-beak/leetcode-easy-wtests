package aincorp.problems.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> integers = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!integers.add(nums[i])) {
                return true;
            }
        }

        return false;

        /*Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], nums[i]);
            } else {
                return true;
            }
        }

        return false;*/

        /*List<Integer> array = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!array.contains(nums[i])) {
                array.add(nums[i]);
            } else {

                return true;
            }
        }

        return false;*/
    }
}
