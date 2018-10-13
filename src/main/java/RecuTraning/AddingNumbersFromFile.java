package RecuTraning;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AddingNumbersFromFile {

    public static final String FILE_PATH = "in.txt";

    public static void main(String[] args) {

        addNumbers();

    }

    private static void addNumbers() {

        int sum = 0;
        try (Scanner sc = new Scanner(new File(FILE_PATH))) {
            while (sc.hasNextInt()) {
                int digit = sc.nextInt();
                sum += digit;
                System.out.println(sum);
            }
        } catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}
