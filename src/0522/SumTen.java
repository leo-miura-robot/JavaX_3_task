package debug;

public class SumTen {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        for(i=1;i<=10;i++){
            sum+=i;
        }

        System.out.println("合計は " + sum);
    }
}