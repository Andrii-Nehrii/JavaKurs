package Lesson18;

public class MethodsExample2 {
    public static void main(String[] args) {
        int temp = 55;
        changeMe(temp);
        System.out.println(temp);//55
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(numbers);
        changeMe(numbers);
        printArray(numbers);
        int [] link2 = numbers;
        link2[2] = -100;
        printArray(numbers);
        printArray(link2);

        printArray(numbers);
        numbers[0] = 10;//ошибка во время программы NullPointerException
        //нельзя взять 0-й элементу "ничего"
        // sout (numbers.length);//тоже NPE - нельзя узнать длинну ничего null
        numbers = link2;
        numbers = new int[]{10, 20, 30};
        System.out.println("numbers: ");
        printArray(numbers);
        String hello = "Hello";
        changeMe(hello);









    }//end main

    public static void changeMe(String hello){
        System.out.println( "hello main" + hello);
        hello = hello +"!!!";
        System.out.println(hello);

    }

    public static void changeMe(int[] array){
        array[0] = 1000;
    }

    public static void changeMe(int x) {
      x = 100;

    }//end change me


    public static void printArray(int[] array) {//Целых чисел
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "]\n"));

        }
    }


}//end class
