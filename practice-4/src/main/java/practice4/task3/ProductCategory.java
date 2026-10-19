package practice4.task3;

public enum ProductCategory {
    ELECTRONICS(1, "Электроника"),
    BOOKS(2, "Книги"),
    HOME(3, "Товары для дома"),
    SPORT(4, "Спорт");

    private final int id;
    private final String title;

    ProductCategory(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public static ProductCategory findById(int id) {
        for (ProductCategory category : values()) {
            if (category.id == id) {
                return category;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return id + ". " + title;
    }
}
