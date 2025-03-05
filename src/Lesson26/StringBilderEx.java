package Lesson26;

import java.util.Arrays;

public class StringBilderEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb = new StringBuilder("Hello");
        sb.append(" ");
        String string = sb.toString();
        System.out.println(string);

        System.out.println(sb.toString());


        sb = new StringBuilder("Hello world");
        String start = "Hello word";
        sb.insert(6 , "beautiful ");
        System.out.println(sb.toString());

        sb = new StringBuilder("Hello world!");
        sb.replace(6 ,11 , "Java");
        System.out.println(sb.toString());


        sb = new StringBuilder("Hello World!");
        sb. delete(5,11);
        System.out.println(sb. toString());

        sb = new StringBuilder("Hello world");
        int index = sb.indexOf("w");
        System.out.println(index);

        sb = new StringBuilder("Hello");
        sb.setLength(10);
        System.out.println(sb.toString());
        char ch1 = sb.charAt(8);
        System.out.println((int)ch1);

        sb.setLength(3);
        System.out.println(sb.toString());

        /*
        Абревиатура  от пользователя
         */

        String ex = String.join(" ", "java" , "is" , "The" ,"..." );
        System.out.println(ex);
        String[] words = ex.split(" ");
        System.out.println(Arrays.toString(words));

        String str1 = "jdfng dfjg";
        char [] chars = str1.toCharArray();
        System.out.println(Arrays.toString(chars));



    }
}
