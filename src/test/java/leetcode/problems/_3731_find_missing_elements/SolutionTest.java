package leetcode.problems._3731_find_missing_elements;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(
                List.of(3),
                solution.findMissingElements(new int[]{1, 4, 2, 5}));
    }

    @Test
    void sampleCase2() {
        assertEquals(
                List.of(),
                solution.findMissingElements(new int[]{7, 8, 6, 9}));
    }

    @Test
    void sampleCase3() {
        assertEquals(
                List.of(2, 3, 4),
                solution.findMissingElements(new int[]{5, 1}));
    }
}
