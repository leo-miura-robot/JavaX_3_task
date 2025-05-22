package debug;

import java.util.Scanner;

public class AgeClassifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("あなたの年齢を入力してください：");

        int age = scan.nextInt();

        if (age < 13) {
            System.out.println("子供です。");
        } else if (age < 20) {
            System.out.println("未成年です。");
        } else if (age < 65) {
            System.out.println("成人です。");
        } else {
            System.out.println("高齢者です。");
        }

        scan.close();
    }
}