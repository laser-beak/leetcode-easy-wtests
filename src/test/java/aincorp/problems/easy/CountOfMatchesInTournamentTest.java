package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountOfMatchesInTournamentTest {

    private final CountOfMatchesInTournament count = new CountOfMatchesInTournament();

    @Test
    void test() {
        assertEquals(6, count.numberOfMatches(7));
        assertEquals(13, count.numberOfMatches(14));
    }

}