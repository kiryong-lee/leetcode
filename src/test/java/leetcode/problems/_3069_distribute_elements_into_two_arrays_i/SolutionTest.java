package leetcode.problems._3069_distribute_elements_into_two_arrays_i;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertArrayEquals(new int[]{2, 3, 1}, solution.resultArray(new int[]{2, 1, 3}));
    }

    @Test
    void sampleCase2() {
        assertArrayEquals(new int[]{5, 3, 4, 8}, solution.resultArray(new int[]{5, 4, 3, 8}));
    }
}
