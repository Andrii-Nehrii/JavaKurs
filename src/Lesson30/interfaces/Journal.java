package Lesson30.interfaces;

public class Journal implements Printable {
    String name;
    int number;

    public Journal(String name, int number) {
        this.name = name;
        this.number = number;
    }


    @Override
    public void print() {
        System.out.printf("Journal %s #%d\n" , name , number);
    }

    @Override
    public void defaultMethod() {
        System.out.println("Overrriding defalt method");
    }
}
