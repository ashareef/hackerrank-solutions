package io.shareef.azher.hackerrank.practice.algorithms.warmup;

import java.util.Arrays;

public class SimpleArraySum {

    public static int simpleArraySum(int[] ar) {
        return Arrays.stream(ar).sum();
    }
}
