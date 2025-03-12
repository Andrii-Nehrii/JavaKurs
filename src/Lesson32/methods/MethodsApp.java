package Lesson32.methods;

import java.util.Arrays;

public class MethodsApp {
    public static void main(String[] args) {
        Integer[] integers = {0, 1, 2, 3, 4, 5, 6};
        Utils.swap(integers , 1 , 5 );
        System.out.println(Arrays.toString(integers));

        String[] strings = {"Hello" , "Java" , "world" , "JS"};
        Utils.swap(strings , 1 , 2);
        System.out.println(Arrays.toString(strings));

        int [] intArray = {1,2,3,4,5,6};
        //Utils.swap(intArray , 1 ,2); Примитивы не приймет


    }
}
