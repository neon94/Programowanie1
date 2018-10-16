package RecuTraning.TextChainsTraning;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SearchCommonPartOfString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj tekst nr. 1 (w ktorym bedziesz szukać): ");
        String text1 = sc.nextLine();
        System.out.println("Podaj tekst nr. 2 (ktory bedzie szukany w tekscie nr.1): ");
        String text2 = sc.nextLine();
        System.out.println("Najdłuższy wspólny tekst to: ");
        System.out.println(commonPart(text1,text2));



    }

    private static Set<String> commonPart(String text1, String text2) {

        int[][] table = new int[text1.length()][text2.length()];
        Set<String> result = new HashSet<>();
        int longest = 0;

        for (int i = 0; i < text1.length(); i++) {
            for (int k = 0; k < text2.length(); k++) {
                if (text1.charAt(i) != text2.charAt(k)) {
                    continue;
                }

                table[i][k] = (i == 0 || k == 0) ? 1
                        : 1 + table[i - 1][k - 1];

                if (table[i][k] > longest) {
                    longest = table[i][k];
                result.clear();
                }

                if (table[i][k] == longest) {
                    result.add(text1.substring(i - longest + 1, i + 1));
                }

        }
    }
    return result;
    }
}
