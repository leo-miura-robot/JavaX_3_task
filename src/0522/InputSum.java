package debug;

import java.util.Scanner;

public class InputSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1から指定した数までの合計を求めます。数値を入力してください：");

        int max = sc.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= max) {
            sum += i;
            i++;
        }

        System.out.println("合計は " + sum + " です。");

        sc.close();
    }
}