package Lesson26.Homework.Shape;

public class Shape {
   protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Фигура: "+ name);
    }
}
