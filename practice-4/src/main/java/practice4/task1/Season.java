package practice4.task1;

public enum Season {
    SPRING(10),
    SUMMER(25) {
        @Override
        public String getDescription() {
            return "Тёплое время года";
        }
    },
    AUTUMN(8),
    WINTER(-10);

    private final int averageTemperature;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
