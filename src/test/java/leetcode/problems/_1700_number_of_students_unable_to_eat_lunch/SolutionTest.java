package leetcode.problems._1700_number_of_students_unable_to_eat_lunch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(
                0,
                solution.countStudents(
                        new int[]{1, 1, 0, 0},
                        new int[]{0, 1, 0, 1}));
    }

    @Test
    void sampleCase2() {
        assertEquals(
                3,
                solution.countStudents(
                        new int[]{1, 1, 1, 0, 0, 1},
                        new int[]{1, 0, 0, 0, 1, 1}));
    }
}
