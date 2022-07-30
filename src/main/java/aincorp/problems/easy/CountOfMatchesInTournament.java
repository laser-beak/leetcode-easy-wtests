package aincorp.problems.easy;

public class CountOfMatchesInTournament {

    public int numberOfMatches(int n) {
        return n - 1;
    }

   /* public int numberOfMatches(int n) {
        int matchCounts = 0;

        while (n > 1) {
            int matches = n;
            matches /= 2;
            matchCounts += matches;
            n -= matches;
        }

        return matchCounts;
    }*/

}
