package leetcode.problems._1260_shift_2d_grid;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;

        int rowShift = k / cols;
        int colShift = k % cols;

        int[][] newGrid = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int newR = (i + rowShift + (j + colShift) / cols) % rows;
                int newC = (j + colShift) % cols;
                newGrid[newR][newC] = grid[i][j];
            }
        }

        List<List<Integer>> answer = new ArrayList<>(rows);
        for (int i = 0; i < rows; i++) {
            List<Integer> row = new ArrayList<>(cols);
            for (int num : newGrid[i]) {
                row.add(num);
            }
            answer.add(row);
        }

        return answer;
    }
}
