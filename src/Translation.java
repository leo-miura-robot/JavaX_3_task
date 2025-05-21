package list_map;

import java.util.HashMap;
import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.println("果物の英単語を入力してください。");
        String fruit = scan.nextLine();

        HashMap<String, String> words = new HashMap<>();
        words.put("apple", "リンゴ");
        words.put("orange", "みかん");
        words.put("grape", "ぶどう");
        words.put("banana", "バナナ");
        words.put("kiwi", "キウィ");

        System.out.println(words.get(fruit));
        
    }
}
