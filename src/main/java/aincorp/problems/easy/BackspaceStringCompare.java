package aincorp.problems.easy;

import java.util.Stack;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> first = process(s);
        Stack<Character> second = process(t);
        return first.equals(second);
    }

    private Stack<Character> process(String text) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(text.charAt(i));
            }
        }
        return stack;
    }
}
