package leetcode.problems._1732_find_the_highest_altitude;

class Solution {

    public int largestAltitude(int[] gain) {

        int highest = 0;
        int current = 0;
        for (int height : gain) {
            current += height;
            if (current > highest) {
                highest = current;
            }
        }

        return highest;
    }
}
