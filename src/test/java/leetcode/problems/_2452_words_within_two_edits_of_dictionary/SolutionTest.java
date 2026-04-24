package leetcode.problems._2452_words_within_two_edits_of_dictionary;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        List<String> actual = solution.twoEditWords(
            new String[]{"word", "note", "ants", "wood"},
            new String[]{"wood", "joke", "moat"}
        );

        assertIterableEquals(List.of("word", "note", "wood"), actual);
    }

    @Test
    void sampleCase2() {
        List<String> actual = solution.twoEditWords(
            new String[]{"yes"},
            new String[]{"not"}
        );

        assertIterableEquals(List.of(), actual);
    }
}