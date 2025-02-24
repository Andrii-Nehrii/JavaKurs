package Lesson17.Homework;

public class Task2 {
    public static void main(String[] args) {
        int [] array = {1, 4, 3, 6, 7};
arrayChange(array);
arrayChange(array , 2);

    }//end main
    public static void arrayChange(int[] array){
        System.out.print("[");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0){
                System.out.print(", ");

            }

        }System.out.println("]");



    }//
    public static void arrayChange(int[] array , int index){
        System.out.print("[");
        for (int i = 0; i < index; i++) {
            System.out.print(array[i]);
            if (i < index - 1){
                System.out.print(", ");
            }

        }
        if (index < array.length){
            System.out.print(", ");
        }

        for (int i = array.length - 1; i >= index; i--) {
            System.out.print(array[i]);
            if (i > index) {
                System.out.print(", ");

            }

        }



        System.out.println("]");
    }
}
