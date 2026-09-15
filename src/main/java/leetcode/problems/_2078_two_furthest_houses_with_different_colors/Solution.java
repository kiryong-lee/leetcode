package leetcode.problems._2078_two_furthest_houses_with_different_colors;

class Solution {

    public int maxDistance(int[] colors) {

        if (colors[0] != colors[colors.length - 1]) {
            return colors.length - 1;
        }

        int targetColor = colors[0];
        int maxDistance = 0;
        for (int i = 1; i < colors.length; i++) {
            if (colors[i] != targetColor) {
                maxDistance = Math.max(maxDistance, Math.max(i, colors.length - i - 1));
            }
        }

        return maxDistance;
    }

}
