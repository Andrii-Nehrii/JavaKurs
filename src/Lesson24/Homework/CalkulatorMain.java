package Lesson24.Homework;

public class CalkulatorMain {
    public static void main(String[] args) {
        Calkulator calkulator = new Calkulator();
        System.out.println( Calkulator.minus(1 ,2 ));
        System.out.println (calkulator.plus(1,2));
        System.out.println(Calkulator.division(4 , 0));
        System.out.println(Calkulator.division(4 , 2));
        System.out.println(Calkulator.multiplication(2 ,10));
        System.out.println(Calkulator.calculateCircumference(3));
        System.out.println(Calkulator.calkulateCiercleArea(3));
    }
}
