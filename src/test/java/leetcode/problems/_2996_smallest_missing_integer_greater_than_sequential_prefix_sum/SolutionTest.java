package leetcode.problems._2996_smallest_missing_integer_greater_than_sequential_prefix_sum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(6, solution.missingInteger(new int[]{1, 2, 3, 2, 5}));
    }

    @Test
    void sampleCase2() {
        assertEquals(15, solution.missingInteger(new int[]{3, 4, 5, 1, 12, 14, 13}));
    }
}
