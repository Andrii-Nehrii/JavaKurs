package Lesson13;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class StringEx {
    public static void main(String[] args) {
        String greeting = "Hello World";//1 способ
        System.out.println(greeting);
        String string1 = new String(("Hello!")); // Не рекомендуемый
        int lenght =  greeting.length();
        System.out.println(lenght);

        System.out.println("Hello".length());
        //toUpperCase() - Метод позволяет все символы в строке в верхний реестр
        System.out.println(greeting.toUpperCase());
        System.out.println("greeting" + greeting);

        // Срока неизменна, если хочу сохранить капс то это нужно сохранить в переменную
        String stringCase = greeting.toLowerCase();
        System.out.println(stringCase);
        greeting = greeting.toUpperCase();
        System.out.println(greeting);

        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";

        // + конкатенация
        String concatStr = str1 + str2 + str3;
        System.out.println(concatStr);

        System.out.println(1 + 3);

        // конкатенвция  и  Операции сложения

        System.out.println(1 + 3 +" : " + 2 + 3);
        //что то + String = все строка


        // конкатенация 2
        String concatStr2 = str1.concat(str2);
        concatStr2 = concatStr2.concat(str3);
        System.out.println(concatStr2);

        String concatStr3 = str1.concat(str2).concat(str3).concat("!!!");
        System.out.println(concatStr3);

        //Конкатенация 3
        // Склеить несколько строк, вставляя между ними одинаковый разделитель
        String concatStr5 = String.join("|||", "Hello" , "World", "Test");
        System.out.println(concatStr5);



        int a = 1;
        int b = 2;
        String str = "Сумма а + Б = " + a +b;
        System.out.println(str);// вышло 12
        // Меняем порядок операции
        str = "Cумма а + б = " + (a + b);
        System.out.println(str);// Теперь все работает и выводит 3

        String digits = "0123456789";
        System.out.println(digits.length());
        //charAt(index)Взять символ из строки по его индексу (номер)
        char symbol = digits.charAt(4);
        System.out.println("symbol ; " + symbol);

        char first = digits.charAt(0);
        char last = digits.charAt(digits.length() - 1);
        System.out.println(first + " " +  last);


        //  Выделение подстроки
        String subString = digits.substring(2);//начинает с индекса 2 вкл
        System.out.println(subString);

        String subStr2 = digits.substring(2 , 7); //2вкл  и до 7не вкл
        System.out.println(subStr2);


        //Замена часте строки
        // replace() , replaceFirst() , replaceAll()


        // работает со строками не поддерживает регулярные выражения
        String string = " One World One";
        String repStr = string.replace("One" , "WW");
        System.out.println(repStr);

        //replaceFirst() - заменяет только первое найденное совпадение
        repStr = string.replaceFirst("One" , "WWW");
        System.out.println(repStr);

        // replaceAll() - заменяет все найденные совпадения на другую строку.
        // Потдерживает регулярные вырадения
        repStr = string.replaceAll("One" , "WW");
        System.out.println(repStr);
        String stringRed = "One World One Onix";
        repStr = stringRed.replaceAll("\\bO\\w+", "Replaced" );
        System.out.println(repStr);



    }
}
