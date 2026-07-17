package leetcode.problems._0383_ransom_note;

class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {

        int[] ransomNoteCount = new int[26];
        for (char c : ransomNote.toCharArray()) {
            ransomNoteCount[c - 'a']++;
        }

        int[] magazineCount = new int[26];
        for (char c : magazine.toCharArray()) {
            magazineCount[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (ransomNoteCount[i] > magazineCount[i]) {
                return false;
            }
        }

        return true;
    }
}
