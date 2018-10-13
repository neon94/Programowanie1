package RecuTraning;

import java.util.Scanner;

public class ChristmasTree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell me how big ChristmasTree will be:");
        int liczba = sc.nextInt();
        System.out.println("\nFirst");
        xMasTreeCuttedLeftSide(liczba);
        System.out.println("\nSecond");
        xMasTreeDiagonal(liczba);
        System.out.println("\nThird");
        xMasTreeWithoutCore(liczba);
        System.out.println("\nForth");
        xMasTreeXsShaped(liczba);



    }

    private static void xMasTreeXsShaped(int n) {
        for(int height = 1; height <= n; height ++) {
            for (int width = 1; width <= n; width++) {
                if (height == width || width + height == n + 1 ) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void xMasTreeWithoutCore(int n) {
        for(int height = 1; height <= n; height ++) {
            for (int width = 1; width <= n; width++) {
                if (height == 1 || width == 1 || height == n || width == n) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void xMasTreeDiagonal(int n) {
        for(int height = 1; height <= n; height ++) {
            for (int width = 1; width <= height; width++) {
                if (height == width) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void xMasTreeCuttedLeftSide(int n) {
        for(int height = 1; height <= n; height ++) {
            for (int width = 1; width <= height; width++) {
                if (height >= width) System.out.print("*");
            }
            System.out.println();
        }
    }
}
