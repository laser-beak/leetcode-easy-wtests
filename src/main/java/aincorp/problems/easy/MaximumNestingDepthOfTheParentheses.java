package aincorp.problems.easy;

import java.util.Stack;

public class MaximumNestingDepthOfTheParentheses {

    public int maxDepth(String s) {
        int count = 0;
        int max = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
                count++;
            }
            if (s.charAt(i) == ')') {
                stack.pop();
                count--;
            }
            if (max < count) {
                max = count;
            }
        }
        return max;
    }
}
