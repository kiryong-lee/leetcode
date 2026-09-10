package leetcode.problems._2515_shortest_distance_to_target_string_in_a_circular_array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(1, solution.closestTarget(new String[]{"hello", "i", "am", "leetcode", "hello"}, "hello", 1));
    }

    @Test
    void sampleCase2() {
        assertEquals(1, solution.closestTarget(new String[]{"a", "b", "leetcode"}, "leetcode", 0));
    }

    @Test
    void sampleCase3() {
        assertEquals(-1, solution.closestTarget(new String[]{"i", "eat", "leetcode"}, "ate", 0));
    }
}
