package practice4.task4;

public class Memory {
    private final int capacityGb;
    private final String type;

    public Memory(int capacityGb, String type) {
        this.capacityGb = capacityGb;
        this.type = type;
    }

    @Override
    public String toString() {
        return capacityGb + " ГБ " + type;
    }
}
