package control_statement ;
import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        System.out.println("aaaaaaaaaaaa");
        Scanner scan = new Scanner( System.in );

		System.out.println("身長(単位:cm)を入力してください。" );
		double height = scan.nextDouble();

		System.out.println("体重(単位:kg)を入力してください。" );
        double weight = scan.nextDouble();

        double bmi = weight /((height/100) * (height/100));
        System.out.println(bmi);
        
        bmi = (double)Math.round(bmi * 10) / 10;

        System.out.println("あなたのBMI値は" + bmi + "です。");

        if (bmi <= 17.6) {
            System.out.println("あなたは痩せすぎです。");
        }
        else if (bmi <= 19.8) {
            System.out.println("あなたは痩せ気味です。");
        }
        else if (bmi <= 24.2) {
            System.out.println("あなたは標準です。");
        }
        else if (bmi <= 26.4) {
            System.out.println("あなたは過体重です。");
        }
        else {
            System.out.println("あなたは肥満です。");
        }
    }
}