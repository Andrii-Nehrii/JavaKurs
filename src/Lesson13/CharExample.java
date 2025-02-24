package Lesson13;

public class CharExample {
    public static void main(String[] args) {
        char a = 'A'; // Переменная будет хванить букву а латинского алфавита
        char a1 = 65;// Число = А
        char a2 = 0x41; // 16 - Формат без ведущих нулей == А
        //a2 = 0x0041;
        char a3 = '\u0041';// 16 формат
        char x = '\u15EE';

        System.out.println("a : " + a);
        System.out.println("a1 : " + a1);
        System.out.println("a2 : " + a2);
        System.out.println("a3 : " + a3);
        System.out.println("x : " + x);
        System.out.println("x : " + x);

        System.out.println("===============\n");


        char letter = 'A';
        letter++;
        System.out.println("letter : " + letter);

        char digit = 48; // 48 = 0
        System.out.println(digit);

        digit += 5;
        System.out.println(digit);


        /*
        0..9 - kod 48..57
        a...z - kod 97...122
        A...Z - kod 65..90
         */
        //digit = digit + 3;
        //

        // что бы получить код символа в 10-ричной сс нужно привести тип char к типу int
        // (int0) digit
        System.out.println((int) +digit);


    }
}
