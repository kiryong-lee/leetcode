package leetcode.problems._1700_number_of_students_unable_to_eat_lunch;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution {

    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> studentsQueue = new ArrayDeque<>();
        for (int student : students) {
            studentsQueue.add(student);
        }
        for (int sandwich : sandwiches) {
            if (!consume(studentsQueue, sandwich)) {
                return studentsQueue.size();
            }
        }
        return 0;
    }

    private boolean consume(Queue<Integer> studentsQueue, int sandwich) {
        int n = studentsQueue.size();
        for (int i = 0; i < n; i++) {
            int preference = studentsQueue.poll();
            if (preference == sandwich) {
                return true;
            }

            studentsQueue.add(preference);
        }
        return false;
    }
}
