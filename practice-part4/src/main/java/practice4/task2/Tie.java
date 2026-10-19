package practice4.task2;

public class Tie extends Clothes implements MenClothing {
    public Tie(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Галстук для мужчины: " + this);
    }
}
