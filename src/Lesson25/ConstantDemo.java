package Lesson25;

public class ConstantDemo {
    public  static  final double PI = 3.141519;//константа.
    public static final int[] ints = new int[5];//Не являеться константой т.к. состояния обьекта (значения массиве) можно изменить
    public static final String COUNTRY = "Germany";// Константа
    public static final String []COLORS = {"Blue" , "Red" , " Green"};

    public ConstantDemo(){
        COLORS[0] = "purple";
        // COUTRY = "USA"; не могу изменить
        String newString = COUNTRY.toUpperCase();
    }

    public static double doublePiSqrt(){
        double result = 2 * PI * PI;
        return result;

    }

}
