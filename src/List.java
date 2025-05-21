package work;

import java.util.Arrays;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] array = new int[5];
        for(int i=0;i<5;i++){
            System.out.println("配列に追加する数字を書いてね");
            int num = scan.nextInt();
            array[i] = num;
        }
        double average = Arrays.stream(array).average().getAsDouble();
        System.out.println(average);
    }
}
