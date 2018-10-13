package RecuTraning;

import java.util.Scanner;
import java.util.stream.IntStream;

public class NumericalSequences {

    public static void main(String[] args) {

        int liczba = getInputNumberOfElements();

        System.out.println("Wyniki poszczególnych ciągów: \n");

        if (checkInputValue(liczba)) return;

        System.out.println("Dodawanie o dwa");
        plusTwo(liczba);
        System.out.println("\nPotega liczby 2 od -1");
        powerTwo(liczba);
        System.out.println("\nSprezynka od 2 do 8");
        fromTwotoEight(liczba);
        System.out.println("\nCiag fibonacciego");
        fibonacciSequence(liczba);

    }

    private static void fibonacciSequence(int n) {
        int n1 = 1, n2 = 1;
        int result;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 2; i <= n; i++) {
            result = n1 + n2;
            System.out.print(result + " ");
            n1 = n2;
            n2 = result;
        }
    }

    private static int getInputNumberOfElements() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów ciągów: ");
        return sc.nextInt();
    }

    private static boolean checkInputValue(int liczba) {
        if (liczba < 1 || liczba > 20) {
            System.out.println("Niepoprawna liczba");
            return true;
        }
        return false;
    }

    private static void plusTwo(int n) {


        for (int i = 1; i <= n; i++) {
            System.out.print(i * 2 - 1 + " ");
        }
/*                  Robi to samo co wyzej
        System.out.println();
        for(int i=1; i <= 2 * n; i += 2) {
            System.out.println(i + " ");
        }
        */
/*
        IntStream.range(1, n + 1).forEach(
                t -> System.out.println(t * 2 - 1)

        );
        */
    }

    private static void powerTwo(int n) {
        for (int k = -1, i = 1, j = 1; i <= n; k += j, i++) {
            j *= 2;
            System.out.print(k + " ");
        }

    }

    private static void fromTwotoEight(int n) {
        for(int result = 2, k = 1, i=1; i <= n; i++, result += k) {
            if (result == 2) {
                k = 2;
            }
            else if (result == 8) {
                k = -2;
            }
            System.out.print(result + " ");
        }

    }


}
