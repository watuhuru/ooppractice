package practice4.task2;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Брюки для мужчины: " + this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Брюки для женщины: " + this);
    }
}
