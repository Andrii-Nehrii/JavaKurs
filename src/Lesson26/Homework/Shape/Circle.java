package Lesson26.Homework.Shape;

public class Circle extends  Shape{
    protected double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void calulateArea(){
    double area = Math.PI * radius * radius;
        System.out.println("Площадь круга : "+ area);
    }


}
