package leetcode.problems._0836_rectangle_overlap;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertTrue(solution.isRectangleOverlap(new int[]{0, 0, 2, 2}, new int[]{1, 1, 3, 3}));
    }

    @Test
    void sampleCase2() {
        assertFalse(solution.isRectangleOverlap(new int[]{0, 0, 1, 1}, new int[]{1, 0, 2, 1}));
    }

    @Test
    void sampleCase3() {
        assertFalse(solution.isRectangleOverlap(new int[]{0, 0, 1, 1}, new int[]{2, 2, 3, 3}));
    }
}
