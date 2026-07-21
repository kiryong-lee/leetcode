package leetcode.problems._0645_set_mismatch;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertArrayEquals(
                new int[]{2, 3},
                solution.findErrorNums(new int[]{1, 2, 2, 4}));
    }

    @Test
    void sampleCase2() {
        assertArrayEquals(new int[]{1, 2}, solution.findErrorNums(new int[]{1, 1}));
    }
}
