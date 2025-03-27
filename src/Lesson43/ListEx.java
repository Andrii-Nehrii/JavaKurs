package Lesson43;

import java.util.*;

public class ListEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list = new ArrayList<>(50);
        list = new ArrayList<>(List.of(1, -10, 5, 0, 25, -100));

        list = new LinkedList<>();
        list = new LinkedList<>(List.of(1, -10, 5, 0, 25, -100));
        list.add(1000);
        list.add(-100);
        System.out.println("list: " + list);

        list.add(3 , 500);

        System.out.println("list: " + list);

        //E get (int index) - возвращает элемент по индексу
        int value = list.get(5);
        System.out.println("value: " + value);

        //E remove (int index) - удаляет элемент по индексу, возвращает старое значение
        System.out.println("list.remove(5): " + list.remove(5));
        System.out.println(list);
       // boolean remove (Objects obj) - метод удаления по значению (из интерфейса Collection)
        System.out.println(list.remove(Integer.valueOf(0)));///Chat gpt ???
        System.out.println(list);

        System.out.println("list.indexOf(4000): " + list.indexOf(4000));// -1 = значение не найдено
        System.out.println("list.indexOf(-100): " + list.indexOf(-100));
        System.out.println("list.lastIndexOf(-100): " + list.lastIndexOf(-100));
        //void sorrt(Comparator <? super E > comparator) - сортирует список с импользованием указанного компаратора
        list.sort((i1 , i2)-> Integer.compare(i2, i1));
        list.sort(Comparator.reverseOrder());

        System.out.println(list);

        list.sort(Integer :: compareTo);
        list.sort(Comparator.naturalOrder());

        System.out.println(list);

       // list<E> sublist(int idxFrom , int idxTo) - возвращает список из элементов
       //находящихся на позициях от idxFrom (включительно) до idxTo (не включительно)





    }
}
