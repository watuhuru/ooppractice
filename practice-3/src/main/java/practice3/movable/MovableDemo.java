package practice3.movable;

public class MovableDemo {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(1, 2, 2, 3);
        MovableCircle circle = new MovableCircle(4, 5, 1, 1, 2.5);
        MovableRectangle rectangle = new MovableRectangle(
            new MovablePoint(0, 0, 2, 2),
            new MovablePoint(5, 3, 2, 2)
        );

        point.moveRight();
        circle.moveUp();
        rectangle.moveDown();

        System.out.println(point);
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println("У точек прямоугольника одинаковая скорость: " + rectangle.hasSameSpeed());
    }
}
