package leetcode.problems._2778_sum_of_squares_of_special_elements;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(21, solution.sumOfSquares(new int[]{1, 2, 3, 4}));
    }

    @Test
    void sampleCase2() {
        assertEquals(63, solution.sumOfSquares(new int[]{2, 7, 1, 19, 18, 3}));
    }
}
