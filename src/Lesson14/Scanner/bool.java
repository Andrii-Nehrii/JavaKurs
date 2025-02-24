package Lesson14.Scanner;

import java.util.Scanner;

public class bool {
    public static void main(String[] args) {
        boolean bol1 = true;
        bol1 = false;

        System.out.println(bol1);

        int x = 10;
        int y = 5;

        boolean b1 = x == y;
        System.out.printf("%s == %s = %s\n", x , y ,b1);


        b1 = x != y;
        System.out.printf("%s !=%s = %s\n", x ,x, b1);

        b1 = x > y;
        System.out.println( b1);

        y = 10;

        b1 = x > y;
        System.out.println(b1);

        b1 = x >= y;
        System.out.println(b1);


        x = 7;
        b1 = x < y;
        System.out.println(b1);

        b1 = x <= y;
        System.out.println(b1);

        String str = "Java is the best";
        // contains
        boolean contains = str.contains("Java");
        System.out.println("str.con+++++++++ " + contains );

        boolean startWith = str.startsWith("Ja");
        System.out.println("str.start Ja " + startWith);
        System.out.println("str.ava " + str.startsWith("ava"));

        System.out.println("lalala j" + str.startsWith("J"));

        boolean endsWith = str.endsWith("best");
        System.out.println(endsWith);
        System.out.println("============================================================================================");

        boolean b2 = !false;
        System.out.println("b2: " + b2);


        b2 = !(4 == 5);
        System.out.println("4 == 5 "+ b2);

        //Состаыные сравнения

        /*
        логическое и "&"
        используеться как and в пайтоне (True and True)
         */
        b2 = true & true;
        System.out.println(b2);

        Scanner sc = new Scanner(System.in);
        // проверка что число входит в диапазон
        // Введиье число от 0 до 100
        System.out.println("ваше число ");
       // int num = sc.nextInt();
        int num = 50;

        b2 = num >= 0 & num <= 100;
        System.out.println(b2);

        // Логическое или "|"
        //Когда достаточно что бы зотя бы одно было тру
        b2 = true | false;
        System.out.println(b2);

        System.out.println("==============\n");

        //Логическое исключающие или (XOR) "^"
        // Тру если две части выражения разные (тру будет только если есть и тру и фолс)

        b2 = true ^ false;
        System.out.println(b2);
        // лог сокр и "&&"
        // выдает тру если обе части тру

        b2 = true && true;

        int a = 10;
        int b = 2;

        boolean bol = (b != 0) && (a / b > 2) ;
        System.out.println("bol: " + bol);


        // "||"- одно тру и не булет считать другую часть


        System.out.println(true ^ true & false);

        /*
        !
        &
        ^
        &&
        ||
        приоритет
         */















    }
}
