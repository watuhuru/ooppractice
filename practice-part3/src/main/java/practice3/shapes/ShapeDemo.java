package practice3.shapes;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5.5, "red", false),
            new Rectangle(1.0, 2.0, "blue", true),
            new Square(6.6, "green", true)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.printf("Площадь: %.2f%n", shape.getArea());
            System.out.printf("Периметр: %.2f%n%n", shape.getPerimeter());
        }

        Shape squareAsShape = new Square(3.0);
        Rectangle squareAsRectangle = (Rectangle) squareAsShape;
        Square square = (Square) squareAsRectangle;
        System.out.println("Сторона квадрата после приведения типов: " + square.getSide());
    }
}
