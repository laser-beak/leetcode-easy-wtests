package aincorp.problems.easy;

public class TruncateSentence {

    public String truncateSentence(String s, int k) {

        /*String[] splitStrings = s.split(" ");

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < k; i++) {
            builder.append(splitStrings[i]);
            if (i < k - 1) {
                builder.append(" ");
            }
        }

        return builder.toString();*/

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                k--;
            }
            if (k == 0) {
                s = s.substring(0, i);
                break;
            }
        }

        return s;
    }
}
