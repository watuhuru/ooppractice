package practice3.movable;

public class MovableCircle implements Movable {
    private final double radius;
    private final MovablePoint center;

    public MovableCircle(double x, double y, double xSpeed, double ySpeed, double radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle[center=" + center + ", radius=" + radius + "]";
    }
}
