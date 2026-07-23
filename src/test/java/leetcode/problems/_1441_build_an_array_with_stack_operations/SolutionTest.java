package leetcode.problems._1441_build_an_array_with_stack_operations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(
                List.of("Push", "Push", "Pop", "Push"),
                solution.buildArray(new int[]{1, 3}, 3));
    }

    @Test
    void sampleCase2() {
        assertEquals(
                List.of("Push", "Push", "Push"),
                solution.buildArray(new int[]{1, 2, 3}, 3));
    }

    @Test
    void sampleCase3() {
        assertEquals(
                List.of("Push", "Push"),
                solution.buildArray(new int[]{1, 2}, 4));
    }
}
