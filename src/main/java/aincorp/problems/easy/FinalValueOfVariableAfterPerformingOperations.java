package aincorp.problems.easy;

public class FinalValueOfVariableAfterPerformingOperations {

    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;

        for (String str: operations) {
            if (str.contains("-")) {
                ans--;
            } else {
                ans++;
            }
        }

        return ans;
    }
}
