package practice4.task3;

public enum Product {
    LAPTOP(1, "Ноутбук", ProductCategory.ELECTRONICS, 64990),
    MOUSE(2, "Мышь", ProductCategory.ELECTRONICS, 1490),
    JAVA_BOOK(3, "Книга по Java", ProductCategory.BOOKS, 1890),
    NOVEL(4, "Роман", ProductCategory.BOOKS, 990),
    MUG(5, "Кружка", ProductCategory.HOME, 450),
    FOOTBALL(6, "Футбольный мяч", ProductCategory.SPORT, 2590);

    private final int id;
    private final String title;
    private final ProductCategory category;
    private final int price;

    Product(int id, String title, ProductCategory category, int price) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public static Product findById(int id) {
        for (Product product : values()) {
            if (product.id == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return id + ". " + title + " — " + price + " руб.";
    }
}
