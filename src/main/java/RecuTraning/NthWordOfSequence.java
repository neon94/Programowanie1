package StrongNumber;

import java.util.Scanner;

public class NthWordOfSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj N-ty wyraz ciagu ktorego wartość chcesz poznać:");
        int liczba = sc.nextInt();
        System.out.println("N-ty wyraz ciągu wynosi:\n"+ sequence(liczba));



    }

    private static double sequence(int n){
        if (n == 0) {
            return 0;
        } else {
            if (n==1) return 1;
            if (n==2) return 0.5;
            }
            return  -sequence(n-1)*sequence(n-2);
    }
}
