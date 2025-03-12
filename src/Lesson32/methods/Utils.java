package Lesson32.methods;

public class Utils {
    public static <T> void swap(T[]array , int idx1 , int idx2){
        T temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }



}
