package Lesson29.Homework;

public class Rectangle extends Shape{
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getPerimeter() {
        return  2 * (width + height);
    }

    @Override
    double getArea() {
        return width * height;

    }
}
