package pl.pjatk.tdd.test.arrays;

import org.junit.Assert;
import org.junit.Test;
import pl.pjatk.tdd.arrays.ArraysStatistics;

public class ArraysStatisticsTest {
    @Test
    public void maximumShouldBePositiveNumber(){
        Assert.assertEquals(1, ArraysStatistics.max(new int[]{-10,-5,1,-2,-13}));
        Assert.assertEquals(56, ArraysStatistics.max(new int[]{5,56,1,-2,-13}));
    }

    @Test
    public void smallestElementTest(){
        Assert.assertEquals(-13, ArraysStatistics.min(new int[]{-10,-5,1,-2,-13}));
        Assert.assertEquals(-5, ArraysStatistics.min(new int[]{5,-5,1,-2,-1}));
    }

    @Test
    public void averageTest(){
        Assert.assertEquals(1.33, ArraysStatistics.avg(new int[]{2,1,1}),2);
        Assert.assertEquals(1.5, ArraysStatistics.avg(new int[]{2,1}),2);
    }

    @Test
    public void sumTest(){
        Assert.assertEquals(4, ArraysStatistics.sum(new int[]{2,1,1}));
        Assert.assertEquals(3, ArraysStatistics.sum(new int[]{2,1}));
    }
}
