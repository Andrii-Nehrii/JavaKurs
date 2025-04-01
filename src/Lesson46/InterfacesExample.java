package Lesson46;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

//Stream API.
public class InterfacesExample {
    public static void main(String[] args) {


        // Consummer<T> - выполняет операцию над обьектом типа Т не возвращая никакого результата
        // void accept(T t)
        Consumer<String> example = new Consumer<String>() {
            @Override
            public void accept(String string) {
                System.out.println(string + "!!!");

            }

        };
        example = string -> System.out.println(string + "!!!");

        example.accept("Hello World");
        example.accept("Java");

        Consumer<String> consumer1 = string -> System.out.println("1. " + string.length());
        Consumer<String> consumer2 = string -> System.out.println("2. " + string + "!");

        Consumer<String> resultCOns = consumer1.andThen(consumer2);
        resultCOns.accept("test");

        Predicate<String> examplePr = new Predicate<String>() {
            @Override
            public boolean test(String string) {
                return false;
            }
        };
        Predicate<String> isShort = string -> string.length() < 3;
        boolean result = isShort.test("Java");
        System.out.println(" isShort.test(\"Java\"); " + result);
        System.out.println(" isShort.test(\"JS\");" + isShort.test("JS"));
        List<Integer> list = new ArrayList<>(List.of(-1, 3, -4, 0, 34, -45, 11, 45, 10, -50, 12, 36, 4));

        List<Integer> res = filterListByPredicate(list, i -> i <0);
        System.out.println( " filterListByPredicate(list, i -> i <0):   " +res);
        res = filterListByPredicate(list , val -> val % 2 != 0);
        System.out.println(res);
        res = filterListByPredicate(list , val -> val > 5);
        System.out.println(res);


        /*
        and()
        or()
        negate()
         */
        System.out.println("====================11=================\n\n\n");

        Predicate<String> isLong = string -> string.length() > 4;
        Predicate<String> isConJava = string -> string.contains("Java");
        Predicate<String> combine = isLong.and(isConJava);
        String word = "Java";
        System.out.println(combine.test(word));

        Predicate<String> combine2 = isConJava.negate();
        System.out.println(combine2.test(word));


        System.out.println("===================");
        //Funktion<T , R >- производит операцию над обьектом типа Т , возвращает результат типа R
        //R apply (T t)

        Function<String , Integer> integerFunction = new Function<String, Integer>() {
            @Override
            public Integer apply(String string) {
                return 0;
            }
        };
        integerFunction = string -> string.length();
        int len = integerFunction.apply("Hello world");
        System.out.println(len);
        Function<String ,String> toUp = string -> string.toUpperCase();
        System.out.println(toUp.apply("Hello world"));


    }

    public static List<Integer> filterListByPredicate(List<Integer> integers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer value : integers) {
            if (predicate.test(value)) {
                result.add(value);
            }
        }
        return result;
    }
   /* public static List<Integer> listNegative(List<Integer> integers){
        List<Integer> result = new ArrayList<>();
        for (Integer value : integers){
            if (predicate.test(value))
        }
    }

    */


}