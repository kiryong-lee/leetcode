package leetcode.problems._1848_minimum_distance_to_the_target_element;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(1, solution.getMinDistance(new int[]{1, 2, 3, 4, 5}, 5, 3));
    }

    @Test
    void sampleCase2() {
        assertEquals(0, solution.getMinDistance(new int[]{1}, 1, 0));
    }

    @Test
    void sampleCase3() {
        assertEquals(0, solution.getMinDistance(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 1, 0));
    }
}
