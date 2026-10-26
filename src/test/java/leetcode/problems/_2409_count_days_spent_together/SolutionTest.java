package leetcode.problems._2409_count_days_spent_together;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(3, solution.countDaysTogether("08-15", "08-18", "08-16", "08-19"));
    }

    @Test
    void sampleCase2() {
        assertEquals(0, solution.countDaysTogether("10-01", "10-31", "11-01", "12-31"));
    }
}
