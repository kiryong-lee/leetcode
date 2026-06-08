package leetcode.problems._2161_partition_array_according_to_given_pivot;

class Solution {

    public int[] pivotArray(int[] nums, int pivot) {

        int[] newNums = new int[nums.length];
        int sameCount = 0;
        int insertPos = 0;
        for (int num : nums) {
            if (num == pivot) {
                sameCount++;
            } else if (num < pivot) {
                newNums[insertPos++] = num;
            }
        }

        for (int i = 0; i < sameCount; i++) {
            newNums[insertPos++] = pivot;
        }

        for (int num : nums) {
            if (num > pivot) {
                newNums[insertPos++] = num;
            }
        }

        return newNums;
    }
}
