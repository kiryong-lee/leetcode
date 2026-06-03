package leetcode.problems._3635_earliest_finish_time_for_land_and_water_rides_ii;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        int actual = solution.earliestFinishTime(
            new int[]{2, 8},
            new int[]{4, 1},
            new int[]{6},
            new int[]{3}
        );

        assertEquals(9, actual);
    }

    @Test
    void sampleCase2() {
        int actual = solution.earliestFinishTime(
            new int[]{5},
            new int[]{3},
            new int[]{1},
            new int[]{10}
        );

        assertEquals(14, actual);
    }
}
