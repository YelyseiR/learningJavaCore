package main.java.javaCoreHW6;

import java.util.Arrays;

class TargetFinder {
    public int[] findTarget(int[] aiCoords, int[][] targets) {
        int[] nearestTarget = targets[0];
        double minDistance = getDistance(aiCoords, targets[0]);

        for (int i = 1; i < targets.length; i++) {
            double distance = getDistance(aiCoords, targets[i]);
            if (distance < minDistance) {
                minDistance = distance;
                nearestTarget = targets[i];
            }
        }

        return nearestTarget;
    }

    private double getDistance(int[] point1, int[] point2) {
        int dx = point1[0] - point2[0];
        int dy = point1[1] - point2[1];
        return Math.sqrt(dx*dx + dy*dy);
    }
}

class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}