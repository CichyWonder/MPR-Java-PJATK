package pl.pjatk.tdd;

public class NumberCheck {
    public static boolean isPrimeNumber(int number) {
        if (number<2){
            return false;
        }
        for (int i=2; i<=number/2; i++){
            if (number % i ==0){
                return false;
            }
        }
        return true;
    }
}
