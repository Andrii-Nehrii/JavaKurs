package Lesson17;

public class MethodsExample {
    public static void main(String[] args) {

        sayHello();
        char ch = 'A';
        printDecinmalCodeOfChar(ch);
        char anotherChar = 'B';
        printDecinmalCodeOfChar('6');
        int[] array = {1, 45, 76, 54, 980, 435, 9, 0};
        printArray(array);
        int[] array2 = {1, 2, 8, 76, 54, 32, 5, 7, 7, 654, 32,};
        printArray(array2);
        String [] strings = {"hello", "Jaxa" , "Test" , "World"};
        printArray(strings);

    }//end main
/*
перегрузка методов!!!!

 */
    public static void printArray(String[] strings){
        System.out.println("[");
        for (int i = 0; i < strings.length; i++) {
            System.out.println((strings[i] + (i == strings.length - 1 ? "]\n" : ", ")));


        }
    }



    public static void printDecinmalCodeOfChar(char ch1) {
        System.out.println((int) ch1);
    }


    public static void sayHello() {
        //Тело метода
        System.out.println("Hello");



    }//end sayHello

    public static void printArray(int[] array) {//Целых чисел
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "]\n"));

        }
    }



}//end class
