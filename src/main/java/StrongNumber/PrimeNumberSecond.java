package StrongNumber;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.lang.StrictMath.sqrt;

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
            if(n % i==0) return false;
        }
        return true;
    }

    private static void printErastostenesPrimes(int n) {
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);

        for (int i=2; i <= sqrt(n); i++){

        }

        for (int i = 1; i <= n; i++) {
            if(primes[i] = true) {
                System.out.println(i);
            }
        }
        /*      To samo co wyżej ale bardziej skomplikowane
        IntStream.range(1,n)
                .filter(t -> primes[t] = true)
                .forEach(System.out::println);
    */
    }


}
