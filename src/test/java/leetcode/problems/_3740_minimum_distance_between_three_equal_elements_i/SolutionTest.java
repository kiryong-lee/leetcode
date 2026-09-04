package leetcode.problems._3740_minimum_distance_between_three_equal_elements_i;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(6, solution.minimumDistance(new int[]{1, 2, 1, 1, 3}));
    }

    @Test
    void sampleCase2() {
        assertEquals(8, solution.minimumDistance(new int[]{1, 1, 2, 3, 2, 1, 2}));
    }

    @Test
    void sampleCase3() {
        assertEquals(-1, solution.minimumDistance(new int[]{1}));
    }
}
