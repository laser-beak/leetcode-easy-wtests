package aincorp.yamock.interview;

public class PalindromeSentence {

    public boolean isPalindromeSentence(String st) {

        if (st == null || st.isEmpty() || st.isBlank()) {
            return false;
        }

        int start = 0;
        int end = st.length() - 1;

        while (start < end) {
            while (!Character.isLetter(st.charAt(start))) {
                start++;
            }

            while (!Character.isLetter(st.charAt(end))) {
                end--;
            }

            if (Character.toLowerCase(st.charAt(start)) != Character.toLowerCase(st.charAt(end))) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
