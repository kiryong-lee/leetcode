package leetcode.problems._3963_create_grid_with_exactly_one_path;

class Solution {

    public String[] createGrid(int m, int n) {

        String[] result = new String[m];
        String row = "." + "#".repeat(n - 1);
        for (int i = 0; i < m - 1; i++) {
            result[i] = row;
        }
        result[m - 1] = ".".repeat(n);

        return result;
    }
}
