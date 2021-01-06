package pl.pjatk_unit.tests;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("1: potęgowanie 2: pierwszy podzielny przez drugi 3: największy wspólny dzielnik");
        int choice = scan.nextInt();

        switch (choice) {
            case 1: {
                System.out.print("Podaj liczbę,którą chcicałbyś podnieść do potęgi:");
                int x = scan.nextInt();
                System.out.print("Podaj liczbę potęgi:");
                int y = scan.nextInt();

                power(x, y);
                break;
            }
            case 2:{
                System.out.print("Podaj liczbę,której chciałbyś sprawdzić podzielność:");
                int x = scan.nextInt();
                System.out.print("Podaj liczbę przez, którą ma się dzielić:");
                int y = scan.nextInt();

                divisibility(x,y);
                break;
            }
            case 3:{

                System.out.print("Podaj pierwszą liczbę:");
                int x = scan.nextInt();
                System.out.print("Podaj drugą liczbę:");
                int y = scan.nextInt();

                gcd(x,y);
                break;
            }
            default:{
                System.out.println("Nie udało się urochmić kalkulatora");
                break;
            }
        }
    }

    public static int power(int x, int y){
            int result=x;

            for(int i=1; i<y;i ++){
                result = result*x;
            }

            System.out.print("Wynik twojego potęgowania wynosi: " + result);
            return result;
    }
    public static boolean divisibility(int x, int y){

            if (x%y==0){
                System.out.println("Jest podzielna");
                return true;
            }
            else{
                System.out.println("Nie jest podzielna");
                return false;
        }
    }
    public static int gcd(int x, int y){
            int gcd=1;

        for(int i = 1; i <= x && i <= y; i++)
        {
            if(x%i==0 && y%i==0)
                gcd = i;
        }
            System.out.print("Największy wspólny dzielnik wynosi: " + gcd);
            return gcd;
    }


}
