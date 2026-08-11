package leetcode.problems._1046_last_stone_weight;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(1, solution.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
    }

    @Test
    void sampleCase2() {
        assertEquals(1, solution.lastStoneWeight(new int[]{1}));
    }
}
