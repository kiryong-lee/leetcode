package leetcode.problems._2913_subarrays_distinct_element_sum_of_squares_i;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(15, solution.sumCounts(List.of(1, 2, 1)));
    }

    @Test
    void sampleCase2() {
        assertEquals(3, solution.sumCounts(List.of(1, 1)));
    }
}
