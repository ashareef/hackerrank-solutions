package io.shareef.azher.hackerrank.practice.algorithms.warmup;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CompareTheTripletsTest {

    @Test
    public void compare_sample_input0() {

        List<Integer> a = Arrays.asList(5, 6, 7);
        List<Integer> b = Arrays.asList(3, 6, 10);

        Assert.assertEquals(Arrays.asList(1, 1), CompareTheTriplets.compareTriplets(a, b));
    }

    @Test
    public void compare_sample_input1() {

        List<Integer> a = Arrays.asList(17, 28, 30);
        List<Integer> b = Arrays.asList(99, 16, 8);

        Assert.assertEquals(Arrays.asList(2, 1), CompareTheTriplets.compareTriplets(a, b));
    }
}