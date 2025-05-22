package control_statement ;

import java.util.Random;
import java.util.Scanner;

public class KazuAte {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        Random random = new Random();

        int randomNum = random.nextInt(10);
        System.out.println(randomNum);

        while (true) {
            System.out.println("数字を入力してね");
            int num = scan.nextInt();

            if (num == randomNum) {
                System.out.println("正解");
                break;
            }
            else {
                System.out.println("不正解");
            }
        }

    }
}
