package Lesson12;

public class TypeCasting {
    public static void main(String[] args) {

        /*
        Два способа преобразования типа данных
        1. Неявное преобразование (автоматическая)
        2. Явное преобразование (каастинг)
         */
        // Неявное преобразование автоматически, когда значение меньшего типа данных
        // преобразуеться в больший тип данных
        byte byteVal = 123;
        int intVal;
        intVal = byteVal;// Неявное переобразование типа байт в тип инт
        System.out.println(intVal);

        double doubleVal = intVal; //Неявное инт в дабл
        System.out.println(doubleVal);

        // Яыное требуеться когда нужно преобразовать значения из большего типа данныхв меньшее (можеь привести к потере данных)
        double doubleVal2 = 42.9;
        int int1 = (int) doubleVal2;// Явное преобразование
        System.out.println(doubleVal2);
        System.out.println(int1);

        short shortVal = (short) int1;
        System.out.println(int1);

        double bifDouble = 3_000_000_000_000_000_000d;// double > int

        int x = 20;
        int y = 7;
        double result;
        // 20 / 7 = 2 (int) = Автоматическое преобразование 2 = 2.0 = result
        result = x / y;
        System.out.println(result);

        result = x / 7.0;
        System.out.println(result);

        /*
        Когда в выражении присутствуют нксколько типов данных, то все меньшие типы данных приводяться автоматьчески приводяться к более широкому типу
         */
        /*
        (float) 20 / 7 =  20.0f / 7 = 20.0f / 7.0f = 2.85 = не явное автоматически в 2.85d = result
        1.int x -> явно преобразовываеться в float
        2.int y -> неявно преоьразуеться в float
        3. Производиться деление 20.0f / 7.0 -> 2.85
        4.2.85f -> неявно (авто) преобразуеться в тип данных double
         */
        result = (float) x / y;
        System.out.println(result);


        result = x / (double) y;
        System.out.println(result);

        // Приоритет мат. операцый
        int varC = 2 + 8 / 2;
        System.out.println(varC);
        /*
         приоритет - как в математике, если приоритет равный  = операция выполняеться слева на право
         1. ()
         2. * / %
         #. + -

         */

        varC = (2 + 8) / 2;
        System.out.println(varC);
        //12 % 5  = 2 + 2 остаток
        varC = 25 / (2 % 5) * 3;
        System.out.println(varC);


    }
}
