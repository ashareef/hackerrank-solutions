package io.shareef.azher.hackerrank.practice.algorithms.warmup;

import org.junit.Assert;
import org.junit.Test;

public class SolveMeFirstTests {

    @Test
    public void sum_of_2_and_3() {
        Assert.assertEquals(5, SolveMeFirst.solveMeFirst(2,3));
    }

    @Test
    public void sum_of_100_and_1100() {
        Assert.assertEquals(1100, SolveMeFirst.solveMeFirst(100, 1000));
    }

}
