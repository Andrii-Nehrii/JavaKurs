package TestProtected;

import Lesson23.Cat;

public class Lesson23Main {
    public static void main(String[] args) {
        Cat cat = new Cat("test", 10, 4);
        System.out.println(cat.toString());
        cat.setAge(15);
        System.out.println(cat.getAge());
        cat.sayMeow();
     //   cat.isDefault = true;
       // cat.isProtected;



    }
}
