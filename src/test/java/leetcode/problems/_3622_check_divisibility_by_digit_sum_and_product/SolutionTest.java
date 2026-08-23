package leetcode.problems._3622_check_divisibility_by_digit_sum_and_product;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertTrue(solution.checkDivisibility(99));
    }

    @Test
    void sampleCase2() {
        assertFalse(solution.checkDivisibility(23));
    }
}
