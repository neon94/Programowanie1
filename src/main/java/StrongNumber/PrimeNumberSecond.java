package StrongNumber;

import java.util.Scanner;

public class PrimeNumberSecond {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long startTime = System.currentTimeMillis();
        printPrimeS(n);
        long endTime = System.currentTimeMillis();
        System.out.println(((double)(endTime - startTime))/1000);

    }

    private static void printPrimeS(int n){
        for(int i=2; i <= n; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int n){
        for(int i = 2; i < n; i++) {
            if(n%i==0) return false;
        }
        return true;
    }


}
