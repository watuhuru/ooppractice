package practice4.task4;

public class Processor {
    private final String model;
    private final int cores;
    private final double clockSpeedGhz;

    public Processor(String model, int cores, double clockSpeedGhz) {
        this.model = model;
        this.cores = cores;
        this.clockSpeedGhz = clockSpeedGhz;
    }

    public String getModel() {
        return model;
    }

    public int getCores() {
        return cores;
    }

    public double getClockSpeedGhz() {
        return clockSpeedGhz;
    }

    @Override
    public String toString() {
        return model + ", " + cores + " ядер, " + clockSpeedGhz + " ГГц";
    }
}

