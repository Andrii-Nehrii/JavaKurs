package Lesson43;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<String> strings = new HashSet<>();
        strings = new ArrayList<>();
        //количество элементов
        System.out.println("strings.size() " + strings.size());


        //пустая ли колеция
        System.out.println("strings.isEmpty() " + strings.isEmpty());

        // boolean add(T t) - добавляяет элемент в колецкию.
        strings.add("Java");
        System.out.println("strings.add(\"Python\") " + strings.add("Python"));
        //переопределенный метод toString
        System.out.println(strings);

        //Статический метод .of() - метод в нескольких интервейсах и классах JFC
        // был введен в джава 9
        //создает неизменяемую (нельзя удалить или добавить элементы) колекцию из элементов
        // доступны для List , Set , Map

        Collection<Integer> integers = List.of(0,1,2,3,4,5,6);
        System.out.println("integers "+ integers);
        //integers.add(7); - не работает

        strings.add("JS");
        strings.add("GO land");
        strings.add("Ruby");

        //addAll(Collection<? extends  T> col) - добавит все элементы из указанной колекции
        strings.addAll(List.of("JS" , "Go land" , "Ruby", "Kotlin"));

        System.out.println(strings);


        System.out.println("======================================\n\n");

        //removeAll(Collection<?> colB) - удаляет все элементы содерж в колекции colВ из колекции на которой вызван метод
        // colA.removeAll(colB) - удаляет из А все элементы которые содержит кол В (ВЫЧИТАНИЕ)
        Collection<Integer> colA = new ArrayList<>();
        colA.addAll(List.of(0,1,2,3,4,5,3,2));
        colA.removeAll(List.of(3,2,1));
        System.out.println("colA.removeAll(List.of(3,2,1)): " + colA);

        // retainAll(Collection<?> colB) - оставляет в колекции вызова только те элементы которые содержаться в колекции В



        // colA.retain(colB) - оставляет в А только те элементы которые так же есть в В

        colA = new ArrayList<>();
        Collection<Integer> colB = new ArrayList<>();
        colA.addAll(List.of(10,20,30,20,40,50,60));
        colB.addAll(List.of(20,30,40,100));
        System.out.println("ColA: "+ colA);
        System.out.println("ColB: " + colB);
        colA.retainAll(colB);
        System.out.println("colA.retainAll(colB)" + colA);



        //boolean remove(Object obj) - удаляет элемент их колекции. true если удален
        System.out.println("colA.remove(100): " + colA.remove(100));
        System.out.println("colA.remove(20): " + colA.remove(20));
        System.out.println(colA);
        //colA.removeAll(List.of(20));
        colA.clear(); // удаляет все
        System.out.println(colA);
        //boolean containsAll(COllection<?> c): возвращает true если колекция сожержит все елемены из указанной колекции












    }
}
