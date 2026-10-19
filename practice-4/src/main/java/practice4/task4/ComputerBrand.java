package practice4.task4;

public enum ComputerBrand {
    APPLE("Apple"),
    DELL("Dell"),
    HP("HP"),
    LENOVO("Lenovo");

    private final String title;

    ComputerBrand(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
