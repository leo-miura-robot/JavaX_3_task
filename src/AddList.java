package list_map;

import java.util.ArrayList;
import java.util.Scanner;

public class AddList {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        ArrayList<String> word_list = new ArrayList<>();
        int i = 0;
		while (true) {
            System.out.println("リストに追加するものを入力してください。endを入力すると受付を終了します。" );
            String word = scan.nextLine();
            if (word.equals("end")) {
                System.out.println("終了します");   
                break;         
            }
            else{
                word_list.add(word);
                System.out.println(word_list.get(i));
            }
            i++;
        }
    }
}
