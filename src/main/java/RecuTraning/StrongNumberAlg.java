package RecuTraning;

import java.util.Scanner;

public class StrongNumberAlg {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe z jakiej liczyc silnie");
        int n = scanner.nextInt();
        System.out.println(n + "!=" + silnia(n));

    }

    private static int silnia(int i){
        if (i < 1)
            return 1;
        else
            return i * silnia(i - 1);
    }


}
