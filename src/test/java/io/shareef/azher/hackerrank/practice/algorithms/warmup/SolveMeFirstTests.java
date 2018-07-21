package io.shareef.azher.hackerrank.practice.algorithms.warmup;

import lombok.extern.slf4j.Slf4j;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

@Slf4j
public class SolveMeFirstTests {

    static SolveMeFirst solveMeFirst;

    @BeforeClass
    public static void setup() {
        solveMeFirst = new SolveMeFirst();
    }

    @AfterClass
    public static void teardown() {
        solveMeFirst = null;
    }

    @Test
    public void sum_of_2_and_3() {
        Assert.assertEquals(5, solveMeFirst.solveMeFirst(2,3));
    }

    @Test
    public void sum_of_100_and_1100() {
        Assert.assertEquals(1100, solveMeFirst.solveMeFirst(100, 1000));
    }

}
