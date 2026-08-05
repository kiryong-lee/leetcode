package leetcode.problems._2073_time_needed_to_buy_tickets;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(6, solution.timeRequiredToBuy(new int[]{2, 3, 2}, 2));
    }

    @Test
    void sampleCase2() {
        assertEquals(8, solution.timeRequiredToBuy(new int[]{5, 1, 1, 1}, 0));
    }
}
