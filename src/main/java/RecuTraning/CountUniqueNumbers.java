package RecuTraning;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class CountUniqueNumbers {

    public static final String FILE_PATH = "numbers.txt";

    public static void main(String[] args) {

        uniqueNumbers();

    }

    private static void uniqueNumbers() {

        int sum = 0;
        int[] tab = new int[11];
        Arrays.fill(tab,0);

        try (Scanner sc = new Scanner(new File(FILE_PATH))) {
            while(sc.hasNextInt()){
                int number = sc.nextInt();
                tab[number]++;
            }

            checkNumbers(tab);
            checkMostUsuallyNumbers(tab);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    private static void checkNumbers(int[] n) {
        int result = 0;
        for(int i = 1; i <= 10; i++) {
            if (n[i] != 0) {
                result += 1;
            }
        }
        System.out.println("Wystapilo " + result + " roznych liczb");
    }

    private static void checkMostUsuallyNumbers(int[] n) {
        int max = 0;
        for (int i = 0; i < n.length; i++){
            if(n[i] > max) {
                max = i;
            }
        }
        System.out.println("Najczesciej wystapila: " + max);
    }

}
