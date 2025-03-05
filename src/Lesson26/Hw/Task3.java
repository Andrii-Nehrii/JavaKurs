package Lesson26.Hw;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
     phrasString();
    }

    public static String phrasString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку из нескольких слов");

      //  String example = "   Hel  v   lo   2    "; = "Hel   v   lo  2"
       // System.out.println(example.trim());
        String input = scanner.nextLine().trim();

        if (input.isEmpty()) return "";
        String [] words = input.split("\\s+");
        System.out.println(Arrays.toString(words));


        return null;
    }
}
