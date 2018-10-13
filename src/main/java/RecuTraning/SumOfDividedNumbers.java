package RecuTraning;

import java.util.Scanner;

public class SumOfDividedNumbers {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int liczba = sc.nextInt();



        System.out.println("Suma dzielników liczby " + liczba + " wynosi" + dividers(liczba));

    }

    public static int dividers(int liczba) {
        int sum = 0;
        for(int i=1; i <= liczba; i++ )
        if (liczba %i ==0){
            sum +=i;
        }
        return sum;
    }

}
