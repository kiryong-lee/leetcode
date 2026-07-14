package leetcode.problems._0069_sqrtx;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(2, solution.mySqrt(4));
    }

    @Test
    void sampleCase2() {
        assertEquals(2, solution.mySqrt(8));
    }
}
