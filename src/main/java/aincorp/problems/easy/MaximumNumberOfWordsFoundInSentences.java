package aincorp.problems.easy;

public class MaximumNumberOfWordsFoundInSentences {

    public int mostWordsFound(String[] sentences) {
        int ans = 0;

        for (int i = 0; i < sentences.length; i++) {
            String[] splitStr = sentences[i].split(" ");

            if (ans <= splitStr.length) {
                ans = splitStr.length;
            }
        }

        return ans;
    }
}
