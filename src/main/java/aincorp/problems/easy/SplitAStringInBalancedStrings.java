package aincorp.problems.easy;

public class SplitAStringInBalancedStrings {

    public int balancedStringSplit(String s) {
        int count = 0;
        int countRL = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                countRL++;
            }
            if (s.charAt(i) == 'L') {
                countRL--;
            }
            if (countRL == 0) {
                count++;
            }
        }

        return count;
    }
}
