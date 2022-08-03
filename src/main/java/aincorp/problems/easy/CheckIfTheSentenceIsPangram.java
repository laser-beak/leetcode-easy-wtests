package aincorp.problems.easy;

public class CheckIfTheSentenceIsPangram {

    public boolean checkIfPangram(String sentence) {
        boolean isPangram = true;

        for (char c = 'a'; c <= 'z'; c++) {
            if (sentence.indexOf(c) == -1) {
                isPangram = false;
            }
        }

        return isPangram;
    }
}
