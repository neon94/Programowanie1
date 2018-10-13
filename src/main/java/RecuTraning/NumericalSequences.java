package RecuTraning;

import java.util.Scanner;
import java.util.stream.IntStream;

public class NumericalSequences {

    public static void main(String[] args) {

        int liczba = getInputNumberOfElements();

        System.out.println("Wyniki poszczególnych ciągów: ");

        if (checkInputValue(liczba)) return;

        //plusTwo(liczba);
        //powerTwo(liczba);
        //fromTwotoEight(liczba);
        fibonacciSequence(liczba);

    }

    private static void fibonacciSequence(int n) {
        ;

        int result = 0;
        for (int i = 1;i <= n; i++) {
            if (n == 0) n=0;
            if (n == 1) n=1;
            else result = (n-1) + (n-2);
        }
        System.out.println(result);
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
            System.out.println(i * 2 - 1 + " ");
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
            System.out.println(k + " ");
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
            System.out.println(result + " ");
        }

    }


}
