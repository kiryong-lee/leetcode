package leetcode.problems._3633_earliest_finish_time_for_land_and_water_rides_i;

class Solution {
    public int earliestFinishTime(
        int[] landStartTime,
        int[] landDuration,
        int[] waterStartTime,
        int[] waterDuration
    ) {
        return Math.min(
                minFinishTime(landStartTime, landDuration, waterStartTime, waterDuration),
                minFinishTime(waterStartTime, waterDuration, landStartTime, landDuration)
        );
    }

    private int minFinishTime(
        int[] firstStartTime,
        int[] firstDuration,
        int[] secondStartTime,
        int[] secondDuration
    ) {
        int minTime = Integer.MAX_VALUE;
        for (int i = 0; i < firstStartTime.length; i++) {
            int firstFinishTime = firstStartTime[i] + firstDuration[i];

            for (int j = 0; j < secondStartTime.length; j++) {
                int finishTime = Math.max(firstFinishTime, secondStartTime[j]) + secondDuration[j];
                minTime = Math.min(minTime, finishTime);
            }
        }

        return minTime;
    }
}
