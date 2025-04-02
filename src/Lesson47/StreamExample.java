package Lesson47;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    /*
    Промежуточные методы (ВСЕ возвращают поток):
    Stream <T> filter (Predicate <T> predicate) - оставляет только те элементы для которых Предикат вернет true
    Фильтрует элементы

    sorted() - сортирет поток в естественном порядке
    sorted(Comparator<T> comparator) - сортирует эдементы потока с использованием компаратора

    Stream <R> map (Funktion <T ,R>action) - преобразует элементы потока с использованием заданной функции

-----------------------
Терминальные методы:

R collect (Collector <T , A, R>)




     */
    /// Посмотреть записи кода сверху и добавить с инета то чего не хватает


    public static void main(String[] args) {
       // task1();
        //task2();
       //task3();
        //task4();
        //task5();
        // task6();
       // task7();
        task8();
    }
    private static void task8(){
        Cat cat1 = new Cat("Bear" , 5 , "braun");
        Cat cat2 =  new Cat("Python" , 7 , "green");
        Cat cat3 =   new Cat("Tiger" , 3 , "yellow");
        Cat cat4 =   new Cat("Panda" , 4 , "black");
        Cat[] cats = {cat1,cat2,cat3,cat4};
       // Arrays.stream(cats)
        List<Cat> longCats = Arrays.stream(cats)
               // .filter(cat -> cat != null)
               // .filter(cat -> Objects.nonNull(cat))

                .filter(Objects :: nonNull)
                .filter(cat -> Objects.nonNull(cat.getName()))
                .filter(cat -> cat.getName().length() > 4)
                .collect(Collectors.toList());
        System.out.println(longCats);
    }





    private static void task7(){
        List<Cat> cats = getListCats();

        Stream<String> catStream = cats.stream()
                .filter(cat -> cat.getWeight() < 5)
                .peek(cat -> System.out.println("After filter " + cat))
                .map(cat -> cat.getName());
        catStream.forEach(name -> System.out.println(name));

    }









    private static void task6(){
       List<Cat> cats = getListCats();

       List<String> names1 = cats.stream()
               .filter(cat -> cat.getName().length() < 5)
               .map(Cat :: getName)
               .collect(Collectors.toList());
        System.out.println(names1);
        System.out.println("==============\n\n");
        List<String >names2 = cats.stream()
                .map(Cat :: getName)
                .filter(name -> name.length() < 5)
                .collect(Collectors.toList());
        System.out.println(names2);
    }










    private  static void task5(){
        List<Cat> cats = getListCats();
      /*  Stream <String> catWeight = cats.stream()
                .map(cat -> cat.getWeight());

       */
        List<Integer> catWeight = cats.stream()
                .map(Cat :: getWeight)
                .collect(Collectors.toList());
        System.out.println(catWeight);
    }






    private static List<Cat> getListCats(){
        return List.of(
                new Cat("Bear" , 5 , "braun"),
                new Cat("Python" , 7 , "green"),
                new Cat("Tiger" , 3 , "yellow"),
                new Cat("Panda" , 4 , "black")

        );
    }
    private static void task4(){
        List< Cat> cats = getListCats();
        Stream<String> namesStream = cats.stream()
                .map(cat -> cat.getName());
        List<String> catNames = cats.stream()
                .map(Cat :: getName)
                .collect(Collectors.toList());///в 11.22 посмотреть а то не понял
        System.out.println(catNames);

    }



    private static  void  task3(){
        List<Cat> cats = getListCats();
       Stream <Cat> stream = cats.stream().filter(cat -> cat.getName().length() > 4);
       List <Cat> longnames = stream.collect(Collectors.toList());
        System.out.println(longnames);
    }


    private static void task2() {
        List<Cat> cats = getListCats();
        // список кошек с весом больше 4
        Stream<Cat> catStream =cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        List<Cat> fatCats = catStream.collect(Collectors.toList());
        System.out.println("fatCats : " + fatCats);
    }

    private static void task1(){




        List<Integer> integers = List.of(-1, 12, 0, 5, 1, -15, 24, 99);
        //Получить список содержащий все положительные числа из исхожного списка
        // СПисок должен быть отсортированый в порядке возрастания

        List<Integer> result = new ArrayList<>();
        for(Integer num : integers){
            if (num > 0){
                result.add(num);
            }
        }
        result.sort(Comparator.naturalOrder());
        System.out.println("result: " + result);
     List<Integer> integerList =   integers.stream()// Создание потока из эдемента List
                .filter(e -> e > 0)// фильтр
                .sorted()// сортировка
                .collect(Collectors.toList());// собрирает элементы потока в колеуцию Лист;



    }
}
