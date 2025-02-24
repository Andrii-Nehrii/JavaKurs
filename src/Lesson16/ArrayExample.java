package Lesson16;

import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array;
        //int array1[];
        String[] strings;
        array = new int[4];// int[4] - 4 количество цыфр которые могут быть записаны в массиве 0....3
        strings = new String[10];
        int[] array2 = new int[8];
        boolean[] bools = new boolean[3];
        int value = array2[0];
        System.out.println(value);
        System.out.println(array2[7]);
        System.out.println(bools[1]);
        System.out.println(strings[9]);
        System.out.println(array2);
        int[] numbers = new int[]{45, 56, -16, 0, 159};
        int[] ints = {-10, 54, 32333, 444};
        int val = numbers[0];
        System.out.println(val);
        numbers[2] = 100;
        System.out.println(numbers[4]);
        int len = numbers.length;//количество ячеек
        System.out.println(len);
        System.out.println("Все значения масива");
        int i = 0;
        while (i < numbers.length){
            System.out.println(numbers[i]+ ", ");
            i++;
        }
        System.out.println();
        Random random = new Random();


        int[] num = new  int[10];
        i = 0;
        System.out.print("[");
        while (i < num.length){
            num[i] = random.nextInt(101);
            System.out.print(num[i] + ", ");
            i++;



        }
        int x = num[0];
        System.out.println("]");


        i = 0;
        System.out.print("[");
        while (i < num.length){
            num[i] = random.nextInt(101);
            System.out.print(num[i] + ", ");

            if (x > num[i]){
                x = num[i];

            }
            i++;

        }
        System.out.println("]");
        System.out.println(x);




    }
}
