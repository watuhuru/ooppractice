package practice4.task2;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Юбка для женщины: " + this);
    }
}
