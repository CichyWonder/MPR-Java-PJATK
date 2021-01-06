package pl.pjatk.tdd.test;

import org.junit.Assert;
import org.junit.Test;
import pl.pjatk.tdd.NumberCheck;

public class NumberCheckTest {
    @Test
    public void threeIsPrimeNumber(){
        Assert.assertTrue(NumberCheck.isPrimeNumber(3));
    }

    @Test
    public void sixIsNotPrimeNumber(){
        Assert.assertFalse(NumberCheck.isPrimeNumber(6));
    }

    @Test
    public void tenIsNotPrimeNumber(){
        Assert.assertFalse(NumberCheck.isPrimeNumber(10));
    }

    @Test
    public void negativeNumbersAreNotPrimeNumbers(){
        Assert.assertFalse(NumberCheck.isPrimeNumber(-2));
    }

    @Test
    public void fifteenIsNotPrimeNumber(){
        Assert.assertFalse(NumberCheck.isPrimeNumber(15));
    }
}
