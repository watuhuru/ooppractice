package practice4.task4;

public class Monitor {
    private final double diagonalInches;
    private final String resolution;

    public Monitor(double diagonalInches, String resolution) {
        this.diagonalInches = diagonalInches;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return diagonalInches + "\" " + resolution;
    }
}
