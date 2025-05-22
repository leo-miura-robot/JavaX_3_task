package debug;

import java.util.Scanner;

public class ScoreAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];
        int total = 0;

        System.out.println("5人分の点数を入力してください");

        for (int i = 0; i < 5; i++) {
            System.out.print(i+1 + "人目: ");
            scores[i] = sc.nextInt();
            total += scores[i];
        }

        int average = total / 5;

        System.out.println("合計点は" + total + "点です。");
        System.out.println("平均点は" + average + "点です。");

        sc.close();
    }
}