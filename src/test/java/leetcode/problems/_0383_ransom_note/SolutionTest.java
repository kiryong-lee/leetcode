package leetcode.problems._0383_ransom_note;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertFalse(solution.canConstruct("a", "b"));
    }

    @Test
    void sampleCase2() {
        assertFalse(solution.canConstruct("aa", "ab"));
    }

    @Test
    void sampleCase3() {
        assertTrue(solution.canConstruct("aa", "aab"));
    }
}
