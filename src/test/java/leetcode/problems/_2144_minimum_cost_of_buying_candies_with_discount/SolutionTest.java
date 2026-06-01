package leetcode.problems._2144_minimum_cost_of_buying_candies_with_discount;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        int actual = solution.minimumCost(new int[]{1, 2, 3});

        assertEquals(5, actual);
    }

    @Test
    void sampleCase2() {
        int actual = solution.minimumCost(new int[]{6, 5, 7, 9, 2, 2});

        assertEquals(23, actual);
    }

    @Test
    void sampleCase3() {
        int actual = solution.minimumCost(new int[]{5, 5});

        assertEquals(10, actual);
    }
}
