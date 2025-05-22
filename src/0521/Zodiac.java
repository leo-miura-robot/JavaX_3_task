package list_map;
import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {
        String [] eto = {"子","丑","寅","卯","辰","未","馬","羊","猿","鳥","犬","イ"};
        System.out.println("干支の数"+eto.length);
        System.out.println(eto[eto.length-1]);


        Scanner scan = new Scanner( System.in );
		System.out.println("年号を入力してください。" );
		int year = scan.nextInt();

        int eto_num = year % 12 - 4;
        System.out.println(eto[eto_num]);

    }
}
