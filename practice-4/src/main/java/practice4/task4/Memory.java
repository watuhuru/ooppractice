package practice4.task4;

public class Memory {
    private final int capacityGb;
    private final String type;

    public Memory(int capacityGb, String type) {
        this.capacityGb = capacityGb;
        this.type = type;
    }

    public int getCapacityGb() {
        return capacityGb;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return capacityGb + " ГБ " + type;
    }
}

