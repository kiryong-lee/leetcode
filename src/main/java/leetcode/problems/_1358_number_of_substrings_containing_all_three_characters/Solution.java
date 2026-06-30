package leetcode.problems._1358_number_of_substrings_containing_all_three_characters;

class Solution {

    public int numberOfSubstrings(String s) {

        int count = 0;
        int[] abc = new int[3];
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            abc[s.charAt(right) - 'a']++;
            while (abc[0] > 0 && abc[1] > 0 && abc[2] > 0) {
                count += (s.length() - right);
                abc[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return count;
    }

}
