package practice3.movable;

public class MovableRectangle implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        if (!haveSameSpeed(topLeft, bottomRight)) {
            throw new IllegalArgumentException("Скорости обеих точек должны совпадать.");
        }
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public boolean hasSameSpeed() {
        return haveSameSpeed(topLeft, bottomRight);
    }

    private static boolean haveSameSpeed(MovablePoint first, MovablePoint second) {
        return first.getXSpeed() == second.getXSpeed()
            && first.getYSpeed() == second.getYSpeed();
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}
