package StrongNumber;

import java.util.Scanner;

public class RecursionWorkOne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę z której chcesz liczyć silnie:\n");
        int liczba = sc.nextInt();
        System.out.println("Silnia wynosi: " + silnia(liczba));

    }

    private static int silnia(int i){
        if (i < 1)
            return 1;
        else
            return i * silnia(i - 1);
    }
}
