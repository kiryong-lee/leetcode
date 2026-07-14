package leetcode.problems._0070_climbing_stairs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(2, solution.climbStairs(2));
    }

    @Test
    void sampleCase2() {
        assertEquals(3, solution.climbStairs(3));
    }
}
