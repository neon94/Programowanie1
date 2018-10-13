package RecuTraning;

import java.util.Scanner;

public class SumRecuNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe z ktorej ma byc policzona suma: ");
        int liczba = sc.nextInt();
        System.out.println("Suma rekurencyjna wynosi: " + recuSum(liczba));


    }


    private static int recuSum(int n) {

        if (n > 0) {
            n = n % 10 + recuSum(n/10);
        }

        return n;
    }

}
