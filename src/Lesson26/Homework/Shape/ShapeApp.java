package Lesson26.Homework.Shape;

public class ShapeApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Квадрат" , 2 , 2);
        Circle circle = new Circle("Круг", 5);

        rectangle.displayInfo();
        rectangle.calkulateArea();
        rectangle.setDimensions(4 ,4);
        rectangle.calkulateArea();
        circle.displayInfo();
        circle.calulateArea();
        circle.setRadius(10);
        circle.calulateArea();

    }
}
