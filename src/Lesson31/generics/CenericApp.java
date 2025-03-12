package Lesson31.generics;

import Lesson28.StaticPolymorphism.Animals.Cat;

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



         






    }
}
