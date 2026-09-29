package leetcode.problems._1752_check_if_array_is_sorted_and_rotated;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertTrue(solution.check(new int[]{3, 4, 5, 1, 2}));
    }

    @Test
    void sampleCase2() {
        assertFalse(solution.check(new int[]{2, 1, 3, 4}));
    }

    @Test
    void sampleCase3() {
        assertTrue(solution.check(new int[]{1, 2, 3}));
    }
}
