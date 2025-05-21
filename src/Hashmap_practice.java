import java.util.HashMap;
import java.util.Scanner;

public class Hashmap_practice {
    public static void main(String[] args) {
        HashMap<String,String> kenchou_list = new HashMap<>();
        kenchou_list.put("東京","東京");
        kenchou_list.put("石川","金沢");
        kenchou_list.put("神奈川","横浜");

        Scanner scan = new Scanner(System.in);
        System.out.println("都道府県名入れてね");
        String ken_name = scan.nextLine();

        System.out.println(kenchou_list.get(ken_name));
    }
}
