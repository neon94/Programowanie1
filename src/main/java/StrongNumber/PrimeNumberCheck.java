package StrongNumber;

import java.util.Scanner;

public class PrimeNumberCheck {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tester liczb pierwszych");
        System.out.println("Podaj liczbę która ma być sprawdzona");
        int liczba = sc.nextInt();
        System.out.println("Czy liczba " + liczba +" jest liczbą pierwszą?\n" + primeNumber(liczba));

    }

    private static boolean primeNumber(int liczba){
            for(int i=2; i < liczba; i++){
            if (liczba %i ==0) {
                return false;
            }
        }
        return true;
    }
}
