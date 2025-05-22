package debug;

import java.util.Scanner;

public class SimpleATM {
    public static void main(String[] args) {
        int balance = 10000;
        Scanner sc = new Scanner(System.in);

        System.out.println("ATMへようこそ");

        while (true) {
            System.out.println("操作を選択してください：");
            System.out.println("1: 残高照会  2: 入金  3: 出金  4: 終了");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("現在の残高は " + balance + " 円です。");
            } else if (choice == 2) {
                System.out.print("入金額を入力してください：");
                int deposit = sc.nextInt();
                balance += deposit;
                System.out.println(deposit + " 円を入金しました。");
            } else if (choice == 3) {
                System.out.print("出金額を入力してください：");
                int withdraw = sc.nextInt();
                if (withdraw <= balance) {
                    balance = balance - withdraw;
                    System.out.println("残高が " + balance + " 円になりました。");
                } else {
                    System.out.println("残高が不足しています。");
                }
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("不正な入力です。");
            }
        }

        System.out.println("ご利用ありがとうございました。");
        sc.close();
    }
}