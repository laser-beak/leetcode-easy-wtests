package aincorp.yamock.interview;

public class PalindromeSentence {

    public boolean isPalindromeSentence(String st) {

        if (st == null || st.isEmpty() || st.isBlank()) {
            return false;
        }

        int p1 = 0;
        int p2 = st.length() - 1;

        while (p1 < p2) {
            while (!Character.isLetter(st.charAt(p1))) {
                p1++;
            }

            while (!Character.isLetter(st.charAt(p2))) {
                p2--;
            }

            if (Character.toLowerCase(st.charAt(p1)) != Character.toLowerCase(st.charAt(p2))) {
                return false;
            }

            p1++;
            p2--;
        }

        return true;
    }
}
