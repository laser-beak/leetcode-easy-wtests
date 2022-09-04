package aincorp.problems.easy;

import java.util.Arrays;
import java.util.Stack;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums.length; i++) {
            if (stack.isEmpty() || nums[i] != stack.peek()) {
                stack.add(nums[i]);
            } else {
                stack.pop();
            }
        }

        return stack.pop();
    }
}
