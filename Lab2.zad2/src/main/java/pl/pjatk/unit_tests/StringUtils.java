package pl.pjatk.unit_tests;

public class StringUtils {

    public static String toUpperCase(String a){
        return a.toUpperCase();
    }

    public static String reverseString(String b) {
        String test1 = new StringBuffer(b).reverse().toString();
        return test1;
    }

    public static String multiplyString(String c, int d) {
        return c.repeat(d).replaceFirst("\\s++$", "");
    }

    public static String removeSmallChars(String e) {
        return e.replaceAll("([a-z])", "");
    }

    public static String removeBigChars(String f) {
        return f.replaceAll("([A-Z])", "");
    }

    public static String removeAllButLetters(String g) {
        return g.replaceAll("([^a-zA-Z])", "");
    }
}

