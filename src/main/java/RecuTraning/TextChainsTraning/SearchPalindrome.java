package RecuTraning.TextChainsTraning;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj tekst w którym szukasz palindrom: ");
        String input = sc.nextLine();

        palindromeScanner(input);


    }

    private static void palindromeScanner(String input){

        for (int i = 1; i < input.length(); i++) {
            for (int j = 1, k = i; i - j >= 0 && i + j < input.length(); j++, k--) {

                if (input.charAt(i - j) != input.charAt(i + j)) {
                    break;
                }
                System.out.println(input.substring(i - j, i + j + 1));
            }

        }
    }
}


