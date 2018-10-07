package StrongNumber;

import java.util.Scanner;

public class StrongNumberAlg {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int strongNumber = scanner.nextInt();
        int i = 1;
        int wynik = 0;

        if (strongNumber < 2) {
            wynik = wynik * i;
            i++;
        } else {
        wynik = 2;
        }

        System.out.println(wynik);

    }

}
