package kiso_test;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class ArgsSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        // 配列宣言ゾーン
        int[] intArgs = new int[args.length];
        int[] intGyakuArgs = new int[args.length];
        
        // 例外処理ゾーン
        if(intArgs.length == 0){
                System.out.println("エラー：引数がありません。");
                System.exit(0);
        }

        for (int i = 0; i < args.length; i++) {
            // System.out.println(intArgs);
            if(Integer.parseInt(args[i])>100 || Integer.parseInt(args[i])<-100){
                System.out.println("エラー：数値は-100～100の範囲の整数で入力してください。");
                System.exit(0);
            }
            else if(args.length>10){
                System.out.println("エラー：引数が10個を超えています。");
                System.exit(0);
            }
            else{
                intArgs[i] = Integer.parseInt(args[i]);
            }     
        }

        // 配列ソートゾーン
        Arrays.sort(intArgs);                               
        for (int i : intArgs) {                             
            System.out.print(i + " , ");                    
        }  
        System.out.println();
        
        for (int i = 0; i < args.length; i++) {
            int j = args.length-1 - i;     
            // System.out.println(j);     
            intGyakuArgs[i] = intArgs[j];
            
            System.out.print(intArgs[j] + " , "); 
            // System.out.println(i);       
        }
        System.out.println("____________________________________");
        System.exit(0);
    }
}

class Janken {
    public static void main(String[] args) {
        System.out.println("aaaaaa");
        Random rnd = new Random();
        String [] name_list = {"純也","真奈実"}; 
        int [] te_list = {0, 0};

        for(int i = 0;i < 2; i++){
            int ran = rnd.nextInt(3); 
            System.out.println(ran);

            switch (ran) {
            case 0:
                System.out.println(name_list[i]+"はグー");
                te_list[i] = ran;
                break;
        
            case 1:
                System.out.println(name_list[i]+"はチョキ");
                te_list[i] = ran;
                break;

            case 2:
                System.out.println(name_list[i]+"はパー");
                te_list[i] = ran;
                break;
            }

        }
        if(te_list[0]==0 && te_list[1]==1 || te_list[0]==1 && te_list[1]==2 || te_list[0]==2 && te_list[1]==0 ){
            System.out.println("純也の勝ち");
        }
        else if(te_list[0]==te_list[1]){
            System.out.println("あいこ");
        }
        else{
            System.out.println("真奈美の勝ち");
        }

    }
}