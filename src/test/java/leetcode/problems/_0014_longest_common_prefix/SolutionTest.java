package leetcode.problems._0014_longest_common_prefix;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals("fl", solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    @Test
    void sampleCase2() {
        assertEquals("", solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

    @Test
    void sampleCase3() {
        assertEquals("a", solution.longestCommonPrefix(new String[]{"ab", "a"}));
    }
}
