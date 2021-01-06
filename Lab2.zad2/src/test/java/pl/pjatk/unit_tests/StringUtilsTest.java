package pl.pjatk.unit_tests;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
    @org.junit.jupiter.api.Test
    public void upperCase(){
        Assert.assertEquals("ALA MA KOTA", StringUtils.toUpperCase("ala ma kota"));
    }
    @Test
    public void upperCaseFalse(){
        Assert.assertFalse("ALA MA KOTA", Boolean.parseBoolean(StringUtils.toUpperCase("ala ma kota"))); }

    @Test
    public void reverse() { Assert.assertEquals("ćawomargorp eibul", StringUtils.reverseString("lubie programować"));}

    @Test
    public void reverseFalse() {Assert.assertFalse("ćawomargorp eibul", Boolean.parseBoolean(StringUtils.reverseString("lubie programować")));}

    @Test
    public void multiplyStringBy3(){ Assert.assertEquals("Test Test Test", StringUtils.multiplyString("Test ",3));
    }

    @Test
    public void multiplyStringBy0(){ Assert.assertEquals("TestTestTest", StringUtils.multiplyString("Test",3));
    }

    @Test
    public void removeSmallCharsEquals(){
        Assert.assertEquals("J K", StringUtils.removeSmallChars("Jan Kowalski"));
    }
    @Test
    public void removeSmallCharsWithNumbers(){
        Assert.assertEquals("J1 K2",StringUtils.removeSmallChars("Jan1 Kowalski2"));
    }

    @Test
    public void removeBigCharsEquals(){
        Assert.assertEquals("an owalski", StringUtils.removeBigChars("Jan Kowalski"));
    }
    @Test
    public void removeBigCharsWithNumbers(){
        Assert.assertEquals("an1 owalski2",StringUtils.removeBigChars("Jan1 Kowalski2"));
    }
    @Test
    public void removeAllButLetters(){
        Assert.assertEquals("Test",StringUtils.removeAllButLetters("123Test!"));
    }

    @Test
    public void removeAllButLetters1() {
        Assert.assertEquals("Test", StringUtils.removeAllButLetters("123 Test !"));
    }
}


