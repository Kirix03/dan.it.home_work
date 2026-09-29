package java_hm_6_2.task_1;

public class Main {
    public static void main(String[] args) {

        Figure square = new Square(5);
        Figure Triangle = new Triangle(4,6,4,6,7);

        Figure circle = new Circle(8);
        System.out.println("Square");
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

        System.out.println();

        System.out.println("Triangle");
        System.out.println(Triangle);
        System.out.println("Area: " + Triangle.getArea());
        System.out.println("Perimeter: " + Triangle.getPerimeter());

        System.out.println();

        System.out.println("Circle");
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
    }
}
