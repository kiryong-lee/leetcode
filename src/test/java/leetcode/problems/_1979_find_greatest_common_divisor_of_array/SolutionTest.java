package leetcode.problems._1979_find_greatest_common_divisor_of_array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(2, solution.findGCD(new int[]{2, 5, 6, 9, 10}));
    }

    @Test
    void sampleCase2() {
        assertEquals(1, solution.findGCD(new int[]{7, 5, 6, 8, 3}));
    }

    @Test
    void sampleCase3() {
        assertEquals(3, solution.findGCD(new int[]{3, 3}));
    }
}
