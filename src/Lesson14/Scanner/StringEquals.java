package Lesson14.Scanner;

public class StringEquals {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JAVA";
        String str4 = new String("Java");
        System.out.println(str1 + "|" + str2 + "|" + str3 + "|" + str4);

        boolean b1 = str1 == str2;
        System.out.println("str1 == str2 : " + b1);// true
        System.out.println("str1 == str3 :" + (str1 == str3) );// false
        System.out.println("str1 == str4: " + (str1 == str4));// false
        System.out.println("str2 == str4: " + (str2 == str4));//false


        //для сравнения строк по значению equals()
        boolean b2 = str1.equals(str2);
        System.out.println(b2);
        System.out.println("str1.equals(str2)" + str1.equals(str2));
        System.out.println("str2.equals(str4)" + str2.equals(str4));

    }
}
