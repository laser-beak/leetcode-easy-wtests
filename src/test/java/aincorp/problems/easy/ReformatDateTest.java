package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReformatDateTest {

    private final ReformatDate reformatDate = new ReformatDate();

    @Test
    void test() {
        assertEquals("2052-10-20", reformatDate.reformatDate("20th Oct 2052"));
        assertEquals("1933-06-06", reformatDate.reformatDate("6th Jun 1933"));
    }

}