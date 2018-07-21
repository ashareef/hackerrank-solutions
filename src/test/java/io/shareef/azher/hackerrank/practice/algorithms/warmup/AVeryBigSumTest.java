package io.shareef.azher.hackerrank.practice.algorithms.warmup;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AVeryBigSumTest {

    @Test
    public void test_array1() {
        long[] array1 = new long[5];
        array1[0] = 1000000001;
        array1[1] = 1000000002;
        array1[2] = 1000000003;
        array1[3] = 1000000004;
        array1[4] = 1000000005;

        Assert.assertEquals(5000000015L, AVeryBigSum.aVeryBigSum(array1));
    }
}