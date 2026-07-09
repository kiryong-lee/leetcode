package leetcode.problems._0066_plus_one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertArrayEquals(new int[]{1, 2, 4}, solution.plusOne(new int[]{1, 2, 3}));
    }

    @Test
    void sampleCase2() {
        assertArrayEquals(new int[]{4, 3, 2, 2}, solution.plusOne(new int[]{4, 3, 2, 1}));
    }

    @Test
    void sampleCase3() {
        assertArrayEquals(new int[]{1, 0}, solution.plusOne(new int[]{9}));
    }
}
