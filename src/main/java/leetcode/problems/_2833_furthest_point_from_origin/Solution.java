package leetcode.problems._2833_furthest_point_from_origin;

class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int lCount = 0;
        int rCount = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'L') {
                lCount++;
            } else if (moves.charAt(i) == 'R') {
                rCount++;
            }
        }
        if (lCount > rCount) {
            return moves.length() - rCount * 2;
        } else {
            return moves.length() - lCount * 2;
        }
    }
}
