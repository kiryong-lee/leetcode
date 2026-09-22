package leetcode.problems._2784_check_if_array_is_good;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertFalse(solution.isGood(new int[]{2, 1, 3}));
    }

    @Test
    void sampleCase2() {
        assertTrue(solution.isGood(new int[]{1, 3, 3, 2}));
    }

    @Test
    void sampleCase3() {
        assertTrue(solution.isGood(new int[]{1, 1}));
    }

    @Test
    void sampleCase4() {
        assertFalse(solution.isGood(new int[]{3, 4, 4, 1, 2, 1}));
    }
}
