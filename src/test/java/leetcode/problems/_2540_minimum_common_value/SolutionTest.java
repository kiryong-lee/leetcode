package leetcode.problems._2540_minimum_common_value;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(2, solution.getCommon(new int[]{1, 2, 3}, new int[]{2, 4}));
    }

    @Test
    void sampleCase2() {
        assertEquals(2, solution.getCommon(new int[]{1, 2, 3, 6}, new int[]{2, 3, 4, 5}));
    }
}
