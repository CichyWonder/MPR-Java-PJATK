package pl.pjatk.tdd.test.strings;

import org.junit.Assert;
import org.junit.Test;
import pl.pjatk.tdd.arrays.ArraysStatistics;
import pl.pjatk.tdd.strings.StringUtils;

public class StringUtilsTest {

    @Test
    public void stringSumTest(){
        Assert.assertEquals(12, StringUtils.sumFromString("525"));
        Assert.assertEquals(25, StringUtils.sumFromString("78910"));
    }
    @Test
    public void palindromTest(){
        Assert.assertEquals(false, StringUtils.checkIfStringIsPalindrom("cos"));
        Assert.assertEquals(true, StringUtils.checkIfStringIsPalindrom("aga"));

    }
}
