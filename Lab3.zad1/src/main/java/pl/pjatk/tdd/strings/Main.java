package pl.pjatk.tdd.strings;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.print(new StringBuilder("aga").reverse().toString());

        System.out.print("Podaj liczbę, której części składowe chcesz dodać:");
        Scanner scan = new Scanner(System.in);
        String number = scan.toString();
        StringUtils.sumFromString(number);

        System.out.print("Podaj wyraz i sprawdź czy jest palindromem:");
        String word = scan.toString();
        StringUtils.checkIfStringIsPalindrom(word);
    }
}
