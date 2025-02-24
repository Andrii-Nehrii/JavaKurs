package Lesson18.Homework;

import java.util.Arrays;

public class Task1_1 {
    public static void main(String[] args) {
        int[] test = {0,1,2,3,4,5,6};

copyOfArray(test, 5);

    }//end main

    public static void copyOfArray(int[] array, int newlength){
        if (newlength < 0){
            return;
        }
        int[] result = new int[newlength];//0,0,0,0,0
        for (int i = 0; i < newlength && i < array.length; i++) {
                result[i] = array[i];





        }

        String elemnts = Arrays.toString(result);
        System.out.println(elemnts);

    }

}
