package practice4.task2;

public class Atelier {
    private final Clothes[] clothes;

    public Atelier(Clothes[] clothes) {
        this.clothes = clothes;
    }

    public void dressWomen() {
        System.out.println("Женская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) {
                ((WomenClothing) item).dressWomen();
            }
        }
    }

    public void dressMen() {
        System.out.println("Мужская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof MenClothing) {
                ((MenClothing) item).dressMan();
            }
        }
    }
}
