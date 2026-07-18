package leetcode.problems._0485_max_consecutive_ones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(3, solution.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
    }

    @Test
    void sampleCase2() {
        assertEquals(2, solution.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1}));
    }
}
