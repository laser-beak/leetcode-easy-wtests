package aincorp.problems.easy;

public class ReverseString {

    public char[] reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char swap = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = swap;
        }
        return s;
    }
}
