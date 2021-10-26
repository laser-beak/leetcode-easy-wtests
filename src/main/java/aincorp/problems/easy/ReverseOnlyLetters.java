package aincorp.problems.easy;

public class ReverseOnlyLetters {

    public String reverseOnlyLetters(String s) {

        char[] sChars = s.toCharArray();

        int k = 0;
        int j = sChars.length - 1;

        while (k < j) {

            if (((sChars[k] >= 'a' && sChars[k] <= 'z') || (sChars[k] >= 'A' && sChars[k] <= 'Z')) &&
                    ((sChars[j] >= 'a' && sChars[j] <= 'z') || (sChars[j] >= 'A' && sChars[j] <= 'Z'))) {
                char pre = sChars[k];
                sChars[k] = sChars[j];
                sChars[j] = pre;
                k++;
                j--;
            } else {
                if (!(sChars[k] >= 'a' && sChars[k] <= 'z') && !(sChars[k] >= 'A' && sChars[k] <= 'Z')) {
                    k++;
                }
                if (!(sChars[j] >= 'a' && sChars[j] <= 'z') && !(sChars[j] >= 'A' && sChars[j] <= 'Z')) {
                    j--;
                }
            }
        }

        if (s.isEmpty()) {
            return "";
        }

        return String.valueOf(sChars);
    }
}
