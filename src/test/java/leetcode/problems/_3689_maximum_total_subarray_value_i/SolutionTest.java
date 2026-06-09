package leetcode.problems._3689_maximum_total_subarray_value_i;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        long actual = solution.maxTotalValue(new int[]{1, 3, 2}, 2);

        assertEquals(4L, actual);
    }

    @Test
    void sampleCase2() {
        long actual = solution.maxTotalValue(new int[]{4, 2, 5, 1}, 3);

        assertEquals(12L, actual);
    }
}
