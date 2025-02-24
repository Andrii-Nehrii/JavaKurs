package Lesson18.Homework;

public class Task1 {
    public static void main(String[] args) {
    int[] array1 = {0 ,1, 2, 3, 4, 5, 6};
    int len = 10;

print(array1, len);





    }//end main
public static void print(int[] array, int len){
        int[] newArray = new int[len];

        for (int i = 0; i < array.length && i < len; i++) {
            newArray[i] = array[i];
        }

    System.out.print("[");

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
            if (i < newArray.length - 1) {
                System.out.print(", ");
            }
        }
    System.out.println("]");

}



}

