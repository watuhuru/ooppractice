package practice4.task2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Футболка для мужчины: " + this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Футболка для женщины: " + this);
    }
}
