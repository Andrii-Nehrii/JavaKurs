package Lesson18.Homework;

import java.util.Arrays;

public class Task2Nepravelno {
    public static void main(String[] args) {
        String[] strings = {"One", "Java", "Python" , "JS" };
        String[] result =getArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));

        strings = null;
        strings = new String[0];
        result = getArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));
    }





    public static String[] getArrayWithSmallestStrings(String[] strings ){
        if (strings == null){
            return new String[0];

        }
        String smallest = strings [0];
        String biggest = strings[0];
        for (int i = 0; i <strings.length ; i++) {
            if (strings[i] != null && strings[i].length() < smallest.length()){
                smallest = strings[i];
            }
            if ( strings[i] != null && strings[i].length() > biggest.length()){
                biggest = strings[i];
            }

        }
        return new String[]{smallest , biggest};
    }
}
