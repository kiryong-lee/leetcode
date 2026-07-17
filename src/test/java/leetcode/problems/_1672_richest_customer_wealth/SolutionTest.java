package leetcode.problems._1672_richest_customer_wealth;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(6, solution.maximumWealth(new int[][]{
                {1, 2, 3},
                {3, 2, 1}
        }));
    }

    @Test
    void sampleCase2() {
        assertEquals(10, solution.maximumWealth(new int[][]{
                {1, 5},
                {7, 3},
                {3, 5}
        }));
    }

    @Test
    void sampleCase3() {
        assertEquals(17, solution.maximumWealth(new int[][]{
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        }));
    }
}
