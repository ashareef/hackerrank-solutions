package io.shareef.azher.hackerrank.practice.algorithms.warmup;

import org.junit.Assert;
import org.junit.Test;

public class SimpleArraySumTest {

    @Test
    public void test_array1() {
        int[] array1 = new int[]{1, 2, 3, 4, 10, 11};

        Assert.assertEquals(SimpleArraySum.simpleArraySum(array1), 31);
    }
}