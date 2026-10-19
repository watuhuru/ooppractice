package practice4.task2;

public class AtelierDemo {
    public static void main(String[] args) {
        Clothes[] wardrobe = {
            new TShirt(ClothingSize.M, 1490, "белый"),
            new Pants(ClothingSize.L, 3990, "синий"),
            new Skirt(ClothingSize.S, 2790, "чёрный"),
            new Tie(ClothingSize.M, 990, "бордовый")
        };

        for (ClothingSize size : ClothingSize.values()) {
            System.out.printf("%s — EU %d, %s%n", size, size.getEuroSize(), size.getDescription());
        }

        Atelier atelier = new Atelier(wardrobe);
        atelier.dressWomen();
        atelier.dressMen();
    }
}
