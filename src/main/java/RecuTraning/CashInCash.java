package RecuTraning;

import java.util.Scanner;

public class CashInCash {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell me how much do you have");
        int cash = sc.nextInt();
        System.out.println("I will give you: ");

        bigMoney(cash);

    }

    private static void bigMoney(int n) {

        int x500 = ((int)Math.floorDiv(n*100, 50000));
        System.out.println(x500 + " x 500 zł");
        n-=500*x500;
        int x200 = ((int)Math.floorDiv(n*100, 20000));
        System.out.println(x200 + " x 200 zł");
        n-=200*x200;
        int x100 = ((int)Math.floorDiv(n*100, 10000));
        System.out.println(x100 + " x 100 zł");
        n-=100*x100;
        int x50 = ((int)Math.floorDiv(n*100, 5000));
        System.out.println(x50 + " x 50 zł");
        n-=50*x50;
        int x20 = ((int)Math.floorDiv(n*100, 2000));
        System.out.println(x20 + " x 20 zł");
        n-=20*x20;
        int x10 = ((int)Math.floorDiv(n*100, 1000));
        System.out.println(x10 + " x 10 zł");
        n-=10*x10;
        int x5 = ((int)Math.floorDiv(n*100, 500));
        System.out.println(x5 + " x 5 zł");
        n-=5*x5;
        int x2 = ((int)Math.floorDiv(n*100, 200));
        System.out.println(x2 + " x 2 zł");
        n-=2*x2;
        int x1 = ((int)Math.floorDiv(n*100, 100));
        System.out.println(x1 + " x 1 zł");
        n-=1*x1;
    }


// 500,200,100,50,20,10,5,2,1

}
