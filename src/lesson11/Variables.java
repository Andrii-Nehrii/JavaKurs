
public class Variables {
    public static void main(String[] args) {
// Java - строго типизированый язык програмирования , а пайтон - динамически
// Пайтон х = 10 / Пайтон сам понимает и определяет тип переменной - число\строка
/*
Строгая типизация - Каждая переменная должна иметь определенный тип данных,
который не может измениться.
Тип данных определяет какие значения могут храниться в переменной и
какие операции  можно выполнять со значением этой переменной


Обьявляя переменную мы должны указать тип данных и выбрать уникальное имя
имена переменных всегда пишуться всегла пишуться с маленькой буквы и в camelCase нотации

 */
        int myFirstVariable;
        myFirstVariable = 1;
        int mySecondVariable = 25;
        System.out.println(mySecondVariable);
        System.out.println(myFirstVariable);
        mySecondVariable = 50;
        System.out.println("my second var: " + mySecondVariable);
        byte byteVar = 0;
        System.out.println(byteVar);
        long longVar = 2_100_000_000000L;


        double doubleVar = 10.54; //float;
        System.out.println(doubleVar);
        float floatVar = 123.456f;
        System.out.println(floatVar);





    }
}

