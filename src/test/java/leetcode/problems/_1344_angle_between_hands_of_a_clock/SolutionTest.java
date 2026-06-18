package leetcode.problems._1344_angle_between_hands_of_a_clock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private static final double DELTA = 1e-5;

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(165.0, solution.angleClock(12, 30), DELTA);
    }

    @Test
    void sampleCase2() {
        assertEquals(75.0, solution.angleClock(3, 30), DELTA);
    }

    @Test
    void sampleCase3() {
        assertEquals(7.5, solution.angleClock(3, 15), DELTA);
    }
}
