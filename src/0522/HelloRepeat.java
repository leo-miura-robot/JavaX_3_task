package debug;

import java.util.Scanner;

public class HelloRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("何回『こんにちは』と表示しますか？");

        int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println("こんにちは");
        }

        sc.close();
    }
}