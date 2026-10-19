package practice4.task2;

public abstract class Clothes {
    private final ClothingSize size;
    private final double price;
    private final String color;

    protected Clothes(ClothingSize size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public ClothingSize getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {размер=" + size + " (EU " + size.getEuroSize()
            + "), цена=" + price + ", цвет='" + color + "'}";
    }
}
