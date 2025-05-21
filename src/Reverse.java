package list_map;

public class Reverse {
    public static void main(String[] args) {
        int[] array = { 7, 8, 2, 1, 9, 4, 6, 5, 3 };
        
        for(int i=0; i<array.length-1; i++){
            int j=(array.length)-i;
            System.out.println(array[j]);
        }
    }
}
