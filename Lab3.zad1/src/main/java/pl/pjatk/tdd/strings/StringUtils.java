package pl.pjatk.tdd.strings;

public class StringUtils {

    public static int sumFromString(String number){
        int result = 0;
        String[] parameters = number.split("");

        for (String counter:parameters) {
            result += Integer.parseInt(counter) ;
        }

        return result;
    }
    public static boolean checkIfStringIsPalindrom(String word){

        if(new StringBuilder(word).reverse().toString().equals(word)){
            return true;
        }
        else{
            return false;
        }

    }

}
