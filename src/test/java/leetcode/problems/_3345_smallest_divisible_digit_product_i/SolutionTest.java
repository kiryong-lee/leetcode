package leetcode.problems._3345_smallest_divisible_digit_product_i;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(10, solution.smallestNumber(10, 2));
    }

    @Test
    void sampleCase2() {
        assertEquals(16, solution.smallestNumber(15, 3));
    }
}
