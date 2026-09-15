package leetcode.problems._2078_two_furthest_houses_with_different_colors;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(3, solution.maxDistance(new int[]{1, 1, 1, 6, 1, 1, 1}));
    }

    @Test
    void sampleCase2() {
        assertEquals(4, solution.maxDistance(new int[]{1, 8, 3, 8, 3}));
    }

    @Test
    void sampleCase3() {
        assertEquals(1, solution.maxDistance(new int[]{0, 1}));
    }
}
