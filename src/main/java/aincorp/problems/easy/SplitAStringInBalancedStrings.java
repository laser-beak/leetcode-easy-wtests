package aincorp.problems.easy;

public class SplitAStringInBalancedStrings {

    public int balancedStringSplit(String s) {
        int result = 0;

        if (s.length() == 2) {
            return 1;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R' && s.charAt(i + 1) == 'L') {
                result++;
            }
        }

        return result;
    }
}
