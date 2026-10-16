package leetcode.problems._3875_construct_uniform_parity_array_i;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertTrue(solution.uniformArray(new int[]{2, 3}));
    }

    @Test
    void sampleCase2() {
        assertTrue(solution.uniformArray(new int[]{4, 6}));
    }
}
