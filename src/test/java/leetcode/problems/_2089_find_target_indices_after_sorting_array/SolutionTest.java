package leetcode.problems._2089_find_target_indices_after_sorting_array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(List.of(1, 2), solution.targetIndices(new int[]{1, 2, 5, 2, 3}, 2));
    }

    @Test
    void sampleCase2() {
        assertEquals(List.of(3), solution.targetIndices(new int[]{1, 2, 5, 2, 3}, 3));
    }

    @Test
    void sampleCase3() {
        assertEquals(List.of(4), solution.targetIndices(new int[]{1, 2, 5, 2, 3}, 5));
    }
}
