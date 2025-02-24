package Lesson12;

public class MainOperations {
    public static void main(String[] args) {
        int var1 = 20;
        int var2 = 7;
        int result;

        result = 15 + 6;
        System.out.println(result);

        result = var1 + var2;
        System.out.println("var1 + var2 = "+ result);
        result = var1 - var2;
        System.out.println(result);
        // Умножене *
        result = var1 * var2;
        System.out.println(result);


        // Целочисленное деление / между двумя целыми числами
        // 20 / 7 = 6 (2.85)
        result = var1 / var2 ;
        System.out.println(result);


        // Взятие остатка от деления %
        result = var1 % var2;
        System.out.println(result);
        System.out.println(5 / 10);
        System.out.println(5 % 10);
        //00000000000000000000000000000000000000000000000000000000
        // Знак / между даблами  = операция обычного деления
        double doubleVar = 20.0; // Все числа с точкой воспринимаються как double
        double doublVar2 = 7.0d;// Явно указано что число double
        double doubleRes = doubleVar / doublVar2;
        System.out.println(doubleRes);




    }
}
