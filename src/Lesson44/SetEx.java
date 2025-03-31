package Lesson44;

import java.util.*;

public class SetEx {
    public static void main(String[] args) {
        String str = "abc";
        String str2 = "abc";
        System.out.println(str.hashCode());
        System.out.println(str.equals(str2));
        System.out.println(str2.hashCode());

        /*
        для коректной работы хеша есть важное правило -
        контракт между hashCode() и equals()

        1. Если два обьекта равны по equals то хеш код тоже равен
        2 если хеши разные то и equals не равен
        3. Многократный вызов метода hashCode должен возвращать одинаковое значение должен возвращать одинаковое значение
         */

        //Конструкторы
        Set<Integer> set = new HashSet<>();//создает пустой хеш сет. Емкость 16 коэф 0.75
        set = new HashSet<>(20);// Пустой ,емкость 20
        // Принимает колекцию - создает новый сет(множество) , содержащий уникальные элементы из указзанной колекции
        set = new HashSet<>(List.of(1, 2, 3, 5, 6, -10, 5, 6, 3, 6, 0));
        System.out.println(set);
        Integer v = -3223;
        System.out.println(v.hashCode());

        List<Integer> startValues = List.of(15, 1, 2, 3, 4, 3, 8, 6, 15, 7, 0, 16, 32);
        Set<Integer> integers = new HashSet<>(startValues);
        System.out.println("HashSEt " + integers);
        //Linked.HashSet - сохраняет порядок добавления элементов
        Set<Integer> linkedSet = new LinkedHashSet<>(startValues);
        System.out.println("LinkedHashSet" + linkedSet);

        //Методы интерфейса Set

        // boolean add (E e) -добавление эдемента
        System.out.println("integers.add(100): " + integers.add(100));//True
        System.out.println(integers);
        System.out.println("integers.add(100): " + integers.add(100));//False
        System.out.println(integers);

        //boolean remove (Object o) - удаляет элемент по значению
        System.out.println("integers.remove(100)" + integers.remove(100));
        System.out.println(integers);
        //boolean contains(Object o)- проверяет присутствие элемента в множестве
        System.out.println("integers.contains(100): " + integers.contains(100));
        System.out.println("integers.contains(32): " + integers.contains(32));
        //int size() - колво элементов в сете
        /*
        boolean  isEmpty() - возвращает true если сет не содержит элментов
        clear() -
         */
        System.out.println("=================================\n\n\n");

        //iterator() 0 возвращает итератор для элементов сета
        // Наличие итератора позволяет последовательно перебирать все элементы циклом for-each
        /// посмотреть
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value + ", ");
        }
        System.out.println();

        for (Integer val : integers) {
            System.out.println(val + ", ");
        }
        System.out.println();
        //Убрать дубликаты
        // Написать метод, который принимает список и возвращает список
        // Состоящий только из уникальных элементов начального списка


        List<Integer> result = getUniqueList(startValues);
        System.out.println("   :" + result);

        //Элементы упорядочены в соответсвии с их естественним порядком (если елементы реализуют Comparable) или компарартором, переданным при создании
        // Реализован в виде бинарного дерева

        //SortedSet
        //Пустой -  естественный порядок сортировки
        SortedSet<Integer> sortedSet = new TreeSet<>(); //Пустое,  упорядоченое множество. Сортировка в соответствии с Comparable
        sortedSet.add(100);
        sortedSet.add(32);
        sortedSet.add(150);
        sortedSet.add(125);
        System.out.println("sortedSet" + sortedSet);

        // принимает коллекцию. Создает set из елементов колекции. Сортировка в естественном порядке
        sortedSet = new TreeSet<>(startValues);
        System.out.println("SortedSet" + sortedSet);

        // Конструктор с коппаратором определяющим порядок хранения элементов

        SortedSet<Integer> treeSet = new TreeSet<>(Comparator.naturalOrder());//будет поддерживаться порядок обратный к   не ествественному порядку
        treeSet.addAll(startValues);
        treeSet.add(10);
        System.out.println("treeSet: " + treeSet);

        treeSet = new TreeSet<>((i1, i2) -> Integer.compare(i2, i1));
        treeSet.addAll(startValues);
        //first() - cамый первый самый левый
        System.out.println(treeSet.first());
        //last() - правый
        System.out.println(treeSet.last());
        // sortedSet<E> head (E element) - больше чем елемент
        SortedSet<Integer> headSet = treeSet.headSet(6);
        System.out.println(headSet);
        //sortedSet<E> tail.set(E element) - больше чем елемент
        SortedSet<Integer> teilset = treeSet.tailSet(6);
        System.out.println(teilset);
        //SortedSet<E> subSet(E from , E to) -  от и до
       // SortedSet<Integer> subSet = treeSet.subSet(6, 16);
        //System.out.println(subSet);

        //comporator() - возвращает коморатов , используемый для упорядочевания элементов в этом множестве
        // если использеться ествественный порядок - вернеться null

        homework("Текстовая 777 строка со словами");


    }

    private static void homework(String testString) {
        String newString = testString.replaceAll("[^a-zA-Za-яА-Я0-9 ]", "");
        System.out.println("New String: " + newString);

        //String str = String.join( " " , "Hello" , "Java", "Test");

       // String[] words = str.split(" ");
        String[] words = newString.split("\\s+");
        System.out.println(Arrays.toString(words));
        List<String> list = Arrays.asList(words);
        System.out.println(list);


    }

    private static <T> List<T> getUniqueList(List<T> list) {
        Set<T> set = new LinkedHashSet<>(list);/// посмотреть
        return new ArrayList<>(set);
    }
}
// Set<Integer> integers = new HashSet<>(startValues);
