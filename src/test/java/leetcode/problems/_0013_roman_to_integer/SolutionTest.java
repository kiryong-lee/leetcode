package leetcode.problems._0013_roman_to_integer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(3, solution.romanToInt("III"));
    }

    @Test
    void sampleCase2() {
        assertEquals(58, solution.romanToInt("LVIII"));
    }

    @Test
    void sampleCase3() {
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }
}
