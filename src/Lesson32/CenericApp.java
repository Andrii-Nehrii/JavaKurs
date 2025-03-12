package Lesson32;

import Lesson28.StaticPolymorphism.Animals.Cat;
import Lesson31.generics.GenericBox;

public class CenericApp {
    public static void main(String[] args) {
        GenericBox<String> box = new GenericBox<>("Hello");
     String value =  box.getValue();
        System.out.println(value.toUpperCase());
        System.out.println(box.getValue().length());

        box.setValue("New Value");

        System.out.println(box);
        System.out.println("====================");
        GenericBox<Cat> catBox = new GenericBox<>(new Cat());
        System.out.println(catBox.getValue());
        //catBox.setValue("wqdqw");
        GenericBox<Integer> intBox = new GenericBox<>(125);
        GenericBox<Integer> intBox2 = new GenericBox<>(200);
        System.out.println(intBox);

        int sum = intBox.getValue() + intBox2.getValue();
        System.out.println(sum);
        int val = intBox.getValue();
        Integer integerVal= intBox.getValue();
        System.out.println("=======================\n");

        Integer a = 127;
        Integer b = 127;
        System.out.println("127 == 127 "+ (a == b));//true
        Integer c = 128;
        Integer d = 128;
        System.out.println("128 ==128 " + (c == d ));
        System.out.println("128 equals 128 " +c.equals(d));

        Integer e = Integer.valueOf(127);
        Integer e1 = Integer.valueOf("127");
       System.out.println(e + " " + e1);
       Double dbl = Double.valueOf(154.5);
       System.out.println("dbl: "+ dbl);

       //parseXXX() - преобразует строку в соответсвующий примитив
       double dblP = Double.parseDouble("456");
       System.out.println(dblP);
       Integer i1 = 127;
       Integer i2 = 256;
       System.out.println(i1 > i2);

       //compareTo - сравнивает текуций обьект с другим обьектом. Кто больше?
       //Возвразаемое значение int
       System.out.println(i1.compareTo(i2));
       //i1 > i2 - положительное
       // i1 < i2 - отрицвтельный
       // i1 = i2 - 0

       Double d2 = 125.67;//Автоупаковка
       d2 = Double.valueOf(125.67);//Явнвя упаковка
       double dPrimitive = d2;//Авто распаковка
       dPrimitive = d2.doubleValue();//Явная расспаковка

       System.out.println("\n===========================");

       Integer integer = 31844;

       double dVal = integer.doubleValue();
       System.out.println(dVal);
       System.out.println(integer.floatValue());

       Double dWrapper = 245.78;
       int iVal = dWrapper.intValue();
       System.out.println(iVal);

       System.out.println(dWrapper.byteValue());
       System.out.println(dWrapper.intValue());


         






    }
}
