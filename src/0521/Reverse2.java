package list_map;

public class Reverse2 {
    public static void main(String[] args) {
        int[] array = { 7, 8, 2, 1, 9, 4, 6, 5, 3 };

        for(int i=array.length-1; i>=0; i--){
            System.out.println(array[i]);
        }
    }
}
