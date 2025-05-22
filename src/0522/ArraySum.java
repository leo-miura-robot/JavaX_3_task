package debug;

public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 8, 10, 2};
        int sum = 0;

        for (int i = 0; i <= numbers.length-1; i++) {
            sum += numbers[i];
        }

        System.out.println("合計: " + sum);
    }
}