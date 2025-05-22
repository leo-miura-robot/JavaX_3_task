package debug;

import java.util.Scanner;

public class MaxFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("3つの整数を入力してください：");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = a;

        if (b > a) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        System.out.println("最大値は " + max + " です。");

        input.close();
    }
}