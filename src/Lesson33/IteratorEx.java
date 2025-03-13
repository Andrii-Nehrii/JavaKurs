package Lesson33;

// iterable and Iterator
//Iterable  - означает, что обьекты этого класса можно последновательно перебирать (итерироваться по ним)
//Один абстрактный метод Iterator <T> iterator () - возвращает итератор для этого набора елементов (колекции)

//Iterator<T> - сообственно итератор , который позволяет обходить колекцию
// - boolean hasNext есть ли
// - t next() вохвращает следующий елемент
// - void remove() - удаляет последний возвращаемый елемент


import lists.MyArrayList;
import lists.MyList;

import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        MyList <String> list = new MyArrayList<>();

        list.addAll("Hello" , "World" , "Java","Python");
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            String strCurrent = iterator.next();
            System.out.println(strCurrent);
        }
        //цикл for each
        /*
        for (Тип переменной   Имя переменной : колекция ){
        действие с переменной
        }
         */

        for (String strCurren : list){
            System.out.println(strCurren);
        }

        MyList<Integer> integers = new MyArrayList<>();
        integers.addAll(1,2,3,4,5,6);

        for (int intCurent : integers){
           // double sum =  intCurent * 2;
            System.out.println(intCurent * 2);
        }

        int[] array = {10,20,30,40,50};
        for (int sum : array){
            System.out.println(sum);
        }
















    }


}
