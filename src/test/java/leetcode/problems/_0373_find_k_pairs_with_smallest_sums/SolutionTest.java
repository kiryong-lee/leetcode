package leetcode.problems._0373_find_k_pairs_with_smallest_sums;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(
                List.of(List.of(1, 2), List.of(1, 4), List.of(1, 6)),
                solution.kSmallestPairs(
                        new int[]{1, 7, 11},
                        new int[]{2, 4, 6},
                        3));
    }

    @Test
    void sampleCase2() {
        assertEquals(
                List.of(List.of(1, 1), List.of(1, 1)),
                solution.kSmallestPairs(
                        new int[]{1, 1, 2},
                        new int[]{1, 2, 3},
                        2));
    }
}
