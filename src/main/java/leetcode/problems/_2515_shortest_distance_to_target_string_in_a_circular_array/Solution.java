package leetcode.problems._2515_shortest_distance_to_target_string_in_a_circular_array;

class Solution {

    public int closestTarget(String[] words, String target, int startIndex) {

        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                minDistance = Math.min(minDistance, shortestDistance(startIndex, i, words.length));
            }
        }

        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }

    private int shortestDistance(int startIndex, int targetIndex, int size) {

        int rightDistance = targetIndex - startIndex;
        if (rightDistance < 0) {
            rightDistance += size;
        }
        int leftDistance = startIndex - targetIndex;
        if (leftDistance < 0) {
            leftDistance += size;
        }
        return Math.min(rightDistance, leftDistance);
    }


}
