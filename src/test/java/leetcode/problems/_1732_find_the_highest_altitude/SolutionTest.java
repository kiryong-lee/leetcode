package leetcode.problems._1732_find_the_highest_altitude;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(1, solution.largestAltitude(new int[]{-5, 1, 5, 0, -7}));
    }

    @Test
    void sampleCase2() {
        assertEquals(0, solution.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2}));
    }
}
