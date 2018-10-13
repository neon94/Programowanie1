package RecuTraning;

import java.util.Scanner;

public class AddingNumbersWithNewLine {

    public static void main(String[] args) {

        addThisNumber();

    }

    private static void addThisNumber() {
        int n2, result;
        System.out.println("Podaj początkową liczbę:");
        Scanner sc = new Scanner(System.in);
        result = sc.nextInt();

        for(int i = 1; i != 0; i++) {
            System.out.println("Podaj liczbę do wykonania działania");
            n2 = sc.nextInt();
            result += n2;
            System.out.println("Wynik: " + (result));
        }
    }


}
