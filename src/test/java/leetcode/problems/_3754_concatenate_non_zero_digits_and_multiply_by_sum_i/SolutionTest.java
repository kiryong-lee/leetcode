package leetcode.problems._3754_concatenate_non_zero_digits_and_multiply_by_sum_i;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(12340L, solution.sumAndMultiply(10203004));
    }

    @Test
    void sampleCase2() {
        assertEquals(1L, solution.sumAndMultiply(1000));
    }
}
