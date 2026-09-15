package leetcode.problems._0796_rotate_string;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertTrue(solution.rotateString("abcde", "cdeab"));
    }

    @Test
    void sampleCase2() {
        assertFalse(solution.rotateString("abcde", "abced"));
    }
}
