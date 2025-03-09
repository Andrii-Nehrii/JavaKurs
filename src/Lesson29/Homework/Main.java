package Lesson29.Homework;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4 ,6 );
        Triangle triangle = new Triangle(3 ,4 ,5);
        double circleArea = circle.getArea();
        double rectangleArea = rectangle.getArea();
        double triangleArea = triangle.getArea();
        double circleP = circle.getPerimeter();
        double rectangleP = rectangle.getPerimeter();
        double triangleP = triangle.getPerimeter();
        double totalArea = circleArea + rectangleArea + triangleArea;
        double totalPer = circleP + rectangleP + triangleP;
        System.out.println("Total Area: "+ totalArea);
        System.out.println("Total Perimeter: "+ totalPer);




    }
}
