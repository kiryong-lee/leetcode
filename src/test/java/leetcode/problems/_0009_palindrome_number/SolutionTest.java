package leetcode.problems._0009_palindrome_number;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertTrue(solution.isPalindrome(121));
    }

    @Test
    void sampleCase2() {
        assertFalse(solution.isPalindrome(-121));
    }

    @Test
    void sampleCase3() {
        assertFalse(solution.isPalindrome(10));
    }
}
