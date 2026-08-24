package leetcode.problems._2839_check_if_strings_can_be_made_equal_with_operations_i;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertTrue(solution.canBeEqual("abcd", "cdab"));
    }

    @Test
    void sampleCase2() {
        assertFalse(solution.canBeEqual("abcd", "dacb"));
    }
}
