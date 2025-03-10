package Lesson30.interfaces;

public interface Printable {
    //константа
    public static final String color = "Black";

    //public abstract
    void print();


    default void defaultMethod() {
        System.out.println("Default method");
    }

    static void testStaticMrthod(String str){
        System.out.println("Static mrthod " + str);
    }




}
