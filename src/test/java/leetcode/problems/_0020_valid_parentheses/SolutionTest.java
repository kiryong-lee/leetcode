package leetcode.problems._0020_valid_parentheses;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertTrue(solution.isValid("()"));
    }

    @Test
    void sampleCase2() {
        assertTrue(solution.isValid("()[]{}"));
    }

    @Test
    void sampleCase3() {
        assertFalse(solution.isValid("(]"));
    }

    @Test
    void sampleCase4() {
        assertTrue(solution.isValid("([])"));
    }

    @Test
    void sampleCase5() {
        assertFalse(solution.isValid("([)]"));
    }
}
