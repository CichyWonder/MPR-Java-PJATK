package pl.pjatk_unit.tests;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest extends Calculator {

    @Test
    public void TestPower(){
        Assert.assertEquals(4, power(2,2));
        Assert.assertEquals(27, power(3,3));
    }
    @Test
    public void TestdDivisibility(){
        Assert.assertEquals(true, divisibility(10,5));
        Assert.assertEquals(false, divisibility(20,7));
    }
    @Test
    public void TestGcd(){
        Assert.assertEquals(30, gcd(60,30));
        Assert.assertEquals(15, gcd(45,30));
    }

}
