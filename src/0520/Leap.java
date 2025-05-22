package control_statement ;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
		System.out.println("調べたい年を入力してください。" );
		int year = scan.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + "はうるう年です。");
        }
        else if (year % 100 == 0) {
            System.out.println(year + "はうるう年ではありません。");
        }
        else if (year % 4 == 0) {
            System.out.println(year + "はうるう年です。");
        }
        else{
            System.out.println(year + "はうるう年ではありません。");
        }

    }
}
