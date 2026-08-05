package leetcode.problems._2073_time_needed_to_buy_tickets;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution {

    public int timeRequiredToBuy(int[] tickets, int k) {

        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < tickets.length; i++) {
            queue.offer(i);
        }

        int time = 0;
        while (!queue.isEmpty()) {
            int person = queue.poll();
            tickets[person]--;
            time++;
            if (person == k && tickets[person] == 0) {
                return time;
            }

            if (tickets[person] > 0) {
                queue.offer(person);
            }
        }

        return -1;
    }
}
