import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_practive {
    public static void main(String[] args) {
        ArrayList<String> name_list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("名前入れてね");
            String name = scan.nextLine();
            if (name.equals("end")) {
                break;
            }
            else{
                name_list.add(name);
            }
        }
        for(String x :name_list){
            System.out.print(x+", ");
        }
    }
}