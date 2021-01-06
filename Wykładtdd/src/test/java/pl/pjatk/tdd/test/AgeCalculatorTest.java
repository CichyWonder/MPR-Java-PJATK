package pl.pjatk.tdd.test;

import org.junit.Assert;
import org.junit.Test;
import pl.pjatk.tdd.Calculator;

public class AgeCalculatorTest {
    @Test(expected = IllegalArgumentException.class)
    public void incorrectBirthDateFormatShouldBeCaught(){
        Calculator.calculateAge("01-01-2010", "2015-10-01");
    }

    @Test (expected = IllegalArgumentException.class)
    public void incorrectGivenDateFormatShouldBeCaught(){
        Calculator.calculateAge("2010-01-01", "01-01-2015");
    }

    @Test
    public void newlyBornShouldBe0Age(){
        Assert.assertEquals(0 ,Calculator.calculateAge("2019-10-15", "2019-10-15"));
    }

    @Test
    public void afterBirthDatePersonIs1YearOlder(){
        Assert.assertEquals(10, Calculator.calculateAge("2000-10-10", "2010-10-11"));
    }

    @Test(expected = ArithmeticException.class)
    public void givenDateShouldBeAfterBirthDate(){
        Calculator.calculateAge("2010-01-01", "2009-12-31");
    }
    @Test
    public void dayBeforeBirthDayPersonIs1YearYounger(){
        Assert.assertEquals(9, Calculator.calculateAge("2000-10-10", "2010-10-09"));
    }
}
