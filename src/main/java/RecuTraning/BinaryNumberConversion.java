package RecuTraning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryNumberConversion {

    public static void main(String[] args) {

        List<Integer> komora = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę do zamiany na binarną:");
        int liczba = sc.nextInt();
        System.out.println("w systemie binarnym to:");
        System.out.println(binary(liczba));






    }

    private static int binary(int n) {
            if (n == 0) return 0;
            if (n % 2 == 0) System.out.println(0);
            if (n % 2 != 0) System.out.println(1);
            return binary(n/2);
    }
}
