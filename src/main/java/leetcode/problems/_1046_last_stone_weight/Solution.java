package leetcode.problems._1046_last_stone_weight;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {

    public int lastStoneWeight(int[] stones) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            queue.add(stone);
        }
        while (queue.size() > 1) {
            int heaviest = queue.poll();
            int secondHeaviest = queue.poll();
            if (heaviest > secondHeaviest) {
                queue.add(heaviest - secondHeaviest);
            }
        }

        return queue.isEmpty() ? 0 : queue.poll();
    }
}
