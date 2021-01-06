package pl.pjatk.tdd.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pl.pjatk.tdd.NumberCheck;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PrimeNumberParamTest {
    private int number;
    private boolean shouldBePrime;

    public PrimeNumberParamTest(int number, boolean shouldBePrime) {
        this.number = number;
        this.shouldBePrime = shouldBePrime;
    }

    @Parameterized.Parameters (name = "{index}: should {0} be a prime number? {1}")
    public static Collection<Object[]> dataProvider() {
        return Arrays.asList(new Object[][]{
                {3, true},
                {6, false},
                {10, false},
                {15, false},
                {2, true},
                {123, false},
                {0, false},
                {11, true}
        });
    }

    @Test
    public void shouldBePrimeNumberTest() {
        Assert.assertEquals(shouldBePrime, NumberCheck.isPrimeNumber(number));
    }
}
