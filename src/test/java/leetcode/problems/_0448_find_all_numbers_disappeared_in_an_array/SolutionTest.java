package leetcode.problems._0448_find_all_numbers_disappeared_in_an_array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(
                List.of(5, 6),
                solution.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }

    @Test
    void sampleCase2() {
        assertEquals(List.of(2), solution.findDisappearedNumbers(new int[]{1, 1}));
    }
}
