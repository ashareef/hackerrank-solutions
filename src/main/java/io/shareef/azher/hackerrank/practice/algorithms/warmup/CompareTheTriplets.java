package io.shareef.azher.hackerrank.practice.algorithms.warmup;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CompareTheTriplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int[] points = new int[2];

        for (int i = 0; i < a.size(); i++) {
            points[0] += (a.get(i) > b.get(i)) ? 1 : 0;
            points[1] += (a.get(i) < b.get(i)) ? 1 : 0;
        }

        return Arrays.stream(points).boxed().collect(Collectors.toList());
    }
}
