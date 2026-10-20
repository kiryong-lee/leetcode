package leetcode.problems._3550_smallest_index_with_digit_sum_equal_to_index;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(2, solution.smallestIndex(new int[]{1, 3, 2}));
    }

    @Test
    void sampleCase2() {
        assertEquals(1, solution.smallestIndex(new int[]{1, 10, 11}));
    }

    @Test
    void sampleCase3() {
        assertEquals(-1, solution.smallestIndex(new int[]{1, 2, 3}));
    }
}
