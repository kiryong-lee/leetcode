package leetcode.problems._3741_minimum_distance_between_three_equal_elements_ii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final leetcode.problems._3741_minimum_distance_between_three_equal_elements_ii.Solution solution = new leetcode.problems._3741_minimum_distance_between_three_equal_elements_ii.Solution();

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
