package leetcode.problems._2833_furthest_point_from_origin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        int actual = solution.furthestDistanceFromOrigin("L_RL__R");

        assertEquals(3, actual);
    }

    @Test
    void sampleCase2() {
        int actual = solution.furthestDistanceFromOrigin("_R__LL_");

        assertEquals(5, actual);
    }

    @Test
    void handlesOnlyUnknownMoves() {
        int actual = solution.furthestDistanceFromOrigin("____");

        assertEquals(4, actual);
    }
}
