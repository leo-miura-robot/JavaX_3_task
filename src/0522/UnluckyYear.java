package debug;

import java.util.Scanner;

public class UnluckyYear {

    public static void main(String[] args) {
        // 厄年の配列を生成(M:男性、F:女性)
        int[] unluckyYearsM = { 25, 42, 61 };
        int[] unluckyYearsF = { 19, 33, 37, 61 };

        // 入力の受付(M or F)
        Scanner input = new Scanner(System.in);
        System.out.println("男性の場合はM、女性の場合はFを入力してください");
        String gender = input.next();

        // M、F以外の文字が入力された場合、メッセージ出力
        if (!(gender.equals("M") || gender.equals("F"))) {
            System.out.println("入力値が正しくありません");
        }

        // 入力の受付(西暦)
        System.out.println("生まれ年を西暦で入力してください");
        int birth = input.nextInt();

        // 数え年の算出
        int kazoeAge = 2018 - birth + 1;

        // 厄年コード(0: 厄年でない, 1: 前厄, 2: 本厄, 3: 後厄)
        int yakuCode = 0;

        // 厄年の判定
        if (gender.equals("F")) {
            for (int i = 0; i < unluckyYearsF.length; i++) {
                if (unluckyYearsF[i] - 1 == kazoeAge) {
                    yakuCode = 1;
                } else if (unluckyYearsF[i] == kazoeAge) {
                    yakuCode = 2;
                } else if (unluckyYearsF[i] + 1 == kazoeAge) {
                    yakuCode = 3;
                }
            }

        } else {
            System.out.println(Array);
            for (int i = 0; i <= unluckyYearsM.length; i++) {
                if (unluckyYearsM[i] - 1 == kazoeAge) {
                    yakuCode = 1;
                } else if (unluckyYearsM[i] == kazoeAge) {
                    yakuCode = 2;
                } else if (unluckyYearsM[i] + 1 == kazoeAge) {
                    yakuCode = 3;
                }
            }
        }
        // 出力
        if (yakuCode == 1) {
            System.out.println("前厄です");
        } else if (yakuCode == 2) {
            System.out.println("本厄です");
        } else if (yakuCode == 3) {
            System.out.println("後厄です");
        } else {
            System.out.println("厄年ではありません");
        }

        // 入力終了
        input.close();
    }

}