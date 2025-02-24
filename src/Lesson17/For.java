package Lesson17;

import java.util.Random;

public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.print(i + ", ");
        }
        System.out.println();

        for (String str = "Hello"; str.length() < 10; str+="$"){
            System.out.println(str);
        }

        int k = 14;
        for (int a = 0 ,f = 1; k >=0 && f < 10;k-- , a = ++a + k, f++){
            System.out.println(k + " "+a+ " " + f);

        }
        System.out.println("===============================================================================================================" );
        System.out.print("[");
        Random random = new Random();
        int[] ints = new int[random.nextInt(11)+5];
        for (int i = 0; i < ints.length; i++){
            ints[i] = random.nextInt(101)-50;
            System.out.print(ints[i] + (i < ints.length - 1 ? ", " : "]\n"));
        }
        /*for (int i = 0, min = ints[i];i < ints.length ;i++){
            if (min > ints[i]){
                min = ints[i];
            }
            System.out.println(min);*/
        int min = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < min){
                min = ints[i];
        }

        }
        System.out.println(min);
        //System.out.println("]");


        System.out.println("========================================");
        for (int i = 0; i < 7; i++) {
            if (i == 3) continue;
            System.out.print(i + ", ");
        }
        System.out.println();

        System.out.println("========================================");
        for (int i = 0; i < 7; i++) {
            if (i == 3) break;
            System.out.print(i + ", ");
        }
        System.out.println();






    }
}
