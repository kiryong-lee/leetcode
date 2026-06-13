package leetcode.problems._3838_weighted_word_mapping;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        String actual = solution.mapWordWeights(
            new String[]{"abcd", "def", "xyz"},
            new int[]{5, 3, 12, 14, 1, 2, 3, 2, 10, 6, 6, 9, 7, 8, 7, 10, 8, 9, 6, 9, 9, 8, 3, 7, 7, 2}
        );

        assertEquals("rij", actual);
    }

    @Test
    void sampleCase2() {
        String actual = solution.mapWordWeights(
            new String[]{"a", "b", "c"},
            new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        );

        assertEquals("yyy", actual);
    }

    @Test
    void sampleCase3() {
        String actual = solution.mapWordWeights(
            new String[]{"abcd"},
            new int[]{7, 5, 3, 4, 3, 5, 4, 9, 4, 2, 2, 7, 10, 2, 5, 10, 6, 1, 2, 2, 4, 1, 3, 4, 4, 5}
        );

        assertEquals("g", actual);
    }
}
