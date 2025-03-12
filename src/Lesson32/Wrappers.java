package Lesson32;

public class Wrappers {
    public static void main(String[] args) {


        Integer maxValue = Integer.MAX_VALUE;
        System.out.println("max: "+maxValue);
        System.out.println("min: "+ Integer.MIN_VALUE);

        //

        Integer wrapperInt = 5;
        System.out.println(wrapperInt);

        int primitixInt = wrapperInt;
        System.out.println(primitixInt);
        System.out.println("====================\n");
    }
}
