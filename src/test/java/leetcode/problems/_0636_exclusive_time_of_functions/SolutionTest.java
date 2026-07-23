package leetcode.problems._0636_exclusive_time_of_functions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertArrayEquals(
                new int[]{3, 4},
                solution.exclusiveTime(
                        2,
                        List.of("0:start:0", "1:start:2", "1:end:5", "0:end:6")));
    }

    @Test
    void sampleCase2() {
        assertArrayEquals(
                new int[]{7},
                solution.exclusiveTime(
                        1,
                        List.of("0:start:0", "0:start:2", "0:end:5", "0:end:6")));
    }

    @Test
    void sampleCase3() {
        assertArrayEquals(
                new int[]{7, 1},
                solution.exclusiveTime(
                        2,
                        List.of(
                                "0:start:0", "0:start:2", "0:end:5",
                                "1:start:6", "1:end:6", "0:end:7")));
    }
}
